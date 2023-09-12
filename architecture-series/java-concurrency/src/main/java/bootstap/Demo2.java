public class Demo2 {

    static Thread mainThread;

    public static void main(String[] args) {

        // ! Methods of making Thread

        Thread t1 = new Thread(new Runnable(),"t1");
        mainThread = Thread.currentThread();
        t1.start();
        for (int i = 0; i < 100000000; i++) {

        }
        System.out.println("Main thread is about to die");
    }

    static class Runnable implements java.lang.Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {

            }
            System.out.println("t1 thread is about to die");
            System.out.println("Main thread are u there ?" + mainThread.isAlive());
        }
    }


}


import java.util.concurrent.Executors;

public class Demo1 {

    static Thread mainThread;

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        // ! Methods of making Thread

        Thread t1 = new Thread(new Runnable());
        t1.start();
//        System.out.println("Main thread are u alive?" + mainThread.isAlive());
        System.out.println("Main thread is about to die");
        mainThread = Thread.currentThread();
    }

    static class Runnable implements java.lang.Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println(String.format("%s:%d %n",Thread.currentThread().getName(),i));

            }
            System.out.println("t1 thread is about to die");
            System.out.println("Main thread are u there ?" + mainThread.isAlive());
        }
    }


}


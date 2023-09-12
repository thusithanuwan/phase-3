public class Demo9 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.printf("%s:%d %n",Thread.currentThread().getName(),i);


            }
        }, "t1");
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.printf("%s:%d %n",Thread.currentThread().getName(),i);


            }
        }, "t2");

        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();

        System.out.println("Main thread is about to die, but decided wait for others");
        t1.join();
        System.out.println("t1 join to die");
        t2.join();
        System.out.println("t2 join to die");
    }
}

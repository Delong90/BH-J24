package by.belhard.j24.lessons.lesson15.threadsExample;

public class ThreadExample {

    public static boolean check = true;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("start Main thread");

        Thread myThread1 = null;

        for (int i = 0; i < 2; i++) {
            myThread1 = new MyThread("THREAD" + i);
            myThread1.start();
        }
        Thread myRunnableThread1 = new Thread(new MyRunnableThread("THREAD5"));
        myRunnableThread1.setDaemon(true);
        myRunnableThread1.start();
//        myRunnableThread1.interrupt();

//        Thread.sleep(2000);
//        check = false;

        Thread myThread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(666);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        myThread2.start();

        myThread2.join();

        System.out.println("end Main thread");

    }
}

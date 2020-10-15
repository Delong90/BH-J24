package by.belhard.j24.lessons.lesson15.threadsExample;

public class MyRunnableThread implements Runnable {

    private final String name;

    public MyRunnableThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        while (ThreadExample.check) {
            System.out.println(name + "(Runnable) ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

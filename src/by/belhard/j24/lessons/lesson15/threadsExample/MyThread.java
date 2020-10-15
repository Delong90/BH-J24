package by.belhard.j24.lessons.lesson15.threadsExample;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " " + i);

            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

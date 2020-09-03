package by.belhard.j24.lessons.lesson04.static_example;

public class StaticUnit {

    private static int counter;
    private String commonField;

    public StaticUnit() {
        this.counter = 0;
    }

    public static int getCounter() {
        System.out.println();
        return counter;
    }

    public static void setCounter(int counter) {
        StaticUnit.counter = counter;
    }

    public void nonStaticMethod1() {
        this.nonStaticMethod2();
    }

    public void nonStaticMethod2() {

    }


}

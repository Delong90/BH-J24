package by.belhard.j24.lessons.lesson04.final_example;

public class FinalUnit {

    /*private static int[] arr = new int[3];

    static {
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 1;
    }*/

    private int a;
    {
        a = 1;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

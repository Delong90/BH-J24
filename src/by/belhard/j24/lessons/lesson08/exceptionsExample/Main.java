package by.belhard.j24.lessons.lesson08.exceptionsExample;

public class Main {

    public static void main(String[] args) {

        Divider divider = new Divider();

        try {
            System.out.println(divider.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {

        }

        System.out.println();
    }

}

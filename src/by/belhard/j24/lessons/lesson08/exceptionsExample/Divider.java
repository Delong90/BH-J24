package by.belhard.j24.lessons.lesson08.exceptionsExample;

public class Divider {

    public Divider() {

    }

    public int divide(int a, int b) {

        /*int result;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            result = 0;
            System.out.println("Error");
        }

        return result;*/

        return a / b;
    }

    public int getA() {

        try {
//            throw new Exception();
//            return 1;
            System.exit(0);
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }

//        return 4;
    }
}

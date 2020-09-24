package by.belhard.j24.lessons.lesson08.exceptionsExample;

import java.io.IOException;

public class Divider {

    public Divider() {

    }

    public int divide(Integer a, Integer b) throws UncheckedException {

        /*int result;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            result = 0;
            System.out.println("Error");
        }

        return result;*/

        /*throw new IOException();*/
        if (b == 0)
            throw new UncheckedException("b = 0");

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

package by.belhard.j24.lessons.lesson08.exceptionsExample;

public class Main {

    public static void main(String[] args) {

        Divider divider = new Divider();

        try {
            System.out.println(divider.divide(1, 0));
        } catch (ArithmeticException e) {
            System.err.println("Error: ArithmeticException");
        } catch (NullPointerException e) {
            System.err.println("Error: NullPointerException");
        } catch (UncheckedException e) {
            System.err.println(e.getMessage());
            System.err.println("Error: IOException");
        }/* catch (Exception e) {
            System.err.println("Error: Exception");
        }*/ finally {
            System.out.println("finally");
        }

        System.out.println();
    }

}

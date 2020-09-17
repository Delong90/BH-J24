package by.belhard.j24.homeworks.hw5.task03;

public class Main {

    public static void main(String[] args) {

        // circle, rectangular, square

        SquareCalculatable figure1 = new Circle(5);
        System.out.println(getSquare(figure1));
        figure1 = new Square(5);
        System.out.println(getSquare(figure1));
        figure1 = new Rectangle(5, 10);
        System.out.println(getSquare(figure1));
    }

    /*@Deprecated
    public static void doSomething() {
        // ..
    }*/

    private static double getSquare(SquareCalculatable figure) {

        return figure.square();
    }
}

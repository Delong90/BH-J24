package by.belhard.j24.homeworks.hw5.task03;

public class Square implements SquareCalculatable{

    private int sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public double square() {
        return sideA * sideA;
    }
}

package by.belhard.j24.homeworks.hw5.task03;

public class Circle implements SquareCalculatable{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double square() {
        return Math.PI * radius * radius;
    }
}

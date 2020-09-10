package by.belhard.j24.homeworks.hw4.playerTask;

public class Player {

//    private int x, y;
    private Position position;
    private double distance;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.distance = 0;
    }

    public Player() {
        this(0, 0);
    }

    public void move(int newX, int newY) {
        double currentMoveDistance = calcDistanceFromCurrent(newX, newY);
        distance += currentMoveDistance;
        System.out.println("move: " + currentMoveDistance);
        this.x = newX;
        this.y = newY;
    }

    public void printPlayersInfo() {
        System.out.println("position: (" + x + ":" + y +
                "), distance: " + distance);

    }

    private double calcDistanceFromCurrent(int newX, int newY) {

        return Math.sqrt(Math.pow(newX - this.x, 2) + Math.pow(newY - this.y, 2));
    }
}

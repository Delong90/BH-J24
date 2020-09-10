package by.belhard.j24.homeworks.hw4.playerTask;

public class PlayerTask {
    public static void main(String[] args) {

        Player player1 = new Player();

        player1.printPlayersInfo();
        player1.move(3, 4);
        player1.printPlayersInfo();
        player1.move(-3, -4);
        player1.printPlayersInfo();
    }
}

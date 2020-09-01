package by.belhard.j24.homeworks.hw2;

public class Task2 {

    public static void main(String[] args) {

        int r = 5;
        String result;

        if (r > 0) {
            result = "Square: " + r * r * Math.PI;
            result += "\nLength: " + 2 * r * Math.PI;
        } else {
            result = "Not valid input";
        }

        System.out.println(result + " !");

        System.out.println();

        System.out.println(10 + 5 + "a");
        System.out.println("b" + 5 + r);
    }
}

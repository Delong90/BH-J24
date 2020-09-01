package by.belhard.j24.homeworks.hw2;

public class Task5 {

    public static void main(String[] args) {

        int a = 2;
        int n = 5;

        int result = 1;

        for (int i = 0; i < n; i++) {
            result *= a;
        }

        System.out.println(result);

        System.out.println(Math.pow(a, n));

    }
}

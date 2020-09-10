package by.belhard.j24.homeworks.hw4.triangleArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int n = 4;
        int a = 5;

        int[][] array = new int[n][];

        for (int i = 0; i < n; i++) {
            array[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                array[i][j] = a;
                a *= 2;
            }
        }

        // for each
        for (int[] ar : array) {
            for (int q : ar) {
                System.out.print(q + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] ar : array) {
            System.out.println(Arrays.toString(ar));
        }

    }
}

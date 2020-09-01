package by.belhard.j24.lessons.lesson03;

public class ArraysLesson {

    public static void main(String[] args) {

        int[] array1 = new int[3];
        int[] array2 = new int[]{1, 5, -20};
        int[] array3 = {10, 21, 5};

        array1[0] = 50;

        System.out.println(array1[0]);
        System.out.println(array1[1]);
//        System.out.println(array1[3]); // error

        System.out.println("--------------");

        int[][] arr1 = new int[2][];
        arr1[0] = new int[2];
        arr1[1] = new int[5];
        int[][] arr2 = new int[3][2];

        int[][] arr3 = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9, 10}};
        System.out.println(arr3[1][2]);

        System.out.println("----------");
        int[] arrExample = arr3[2];

        for (int i = 0; i < arrExample.length; i++) {
            System.out.println(arrExample[i]);
        }

        for (int i : arrExample) {
            if (i == 8) continue;
            System.out.println(i);
        }




    }
}

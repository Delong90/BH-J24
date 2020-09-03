package by.belhard.j24.lessons.lesson02;

import by.belhard.j24.lessons.lesson03.Person;
import by.belhard.j24.lessons.lesson03.Sex;

public class Lesson02 {

    public static void main(String[] args) {

        int i = 10;

        while (i <= 5) {
            System.out.print(i++ + " ");
            int y = 0;
        }

        int y = 1;

        System.out.println();

        do {
            System.out.print(--i + " ");
        } while (i > 0);
        System.out.println();

        for (int q = 0; q <= 10; q = q + 2) {
            System.out.print(q + " ");
        }
        System.out.println();

        for (int q = 0; q <= 10; q++) {
            if (q % 2 == 1)
                System.out.println(q);
        }
        System.out.println();

        for (int q = 0; ; ) {
            System.out.println("eternity");
            q += 1;
            if (q == 5) break;
        }

//        Person person = new Person("",5, Sex.MALE, "", 1);
    }
}

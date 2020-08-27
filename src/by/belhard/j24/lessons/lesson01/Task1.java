package by.belhard.j24.lessons.lesson01;

public class Task1 {

    public static void main(String[] args) {
        System.out.println();

        byte b = (byte) 256;
        System.out.println(b);

        b = 127;
        b = (byte) (b + 1);
        System.out.println(b);

        char c = 'a';
        System.out.println(c);
        System.out.println((int) c);

        System.out.println((char) 99);

        System.out.println();

        long l = 10_000_000_000L;

        double d = 0.21;
        float f = 0.21F;

        boolean b1 = false;
        boolean b2 = true;

        double r = b + (c + l) + d + f;
        System.out.println();

        System.out.println(15 % 4);

        int i = 5;

        System.out.println(i++);
        System.out.println(++i);

        System.out.println();

        System.out.println(5 > 7);
        System.out.println(21 == 10);

        System.out.println();

        System.out.println(b1 & (b2 || b1));

        int temp = 21;

        if (temp >= 20) {
            System.out.println("Maika");
        } else if (temp > 5) {
            System.out.println("Sweater");
        } else {
            System.out.println("Kurtka");
        }

        System.out.println();

        /** */

        int cash = 100;
        /*String snacks = "";

        if (cash > 100) {
            snacks = "Pringles";
        } else if (cash > 50) {
            snacks = "Onega";
        } else {
            snacks = null;
        }*/

        String snacks = cash > 100 ? "Pringles" : (cash > 50 ? "Onega" : null);

        System.out.println(snacks);

        System.out.println();

        double d2 = 5 / 2.7;
        System.out.println(d2);

        double a = 5;
        double w = 2;
        double d3 = a / 2;
        System.out.println(d3);
    }
}

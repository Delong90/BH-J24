package by.belhard.j24.lessons.lesson07.stringsExample;

import java.util.Formatter;
import java.util.Locale;

public class StringsExample {

    public static void main(String[] args) {

        String s1 = "123";
        String s2 = "123";
        String s3 = new String("123");
        String s4 = "123";

        System.out.println(s1 == s2); // String Pool
        System.out.println(s1.equals(s2));
        System.out.println();

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        s3 = s3.intern();

        System.out.println();

        // StringBuilder
        // StringBuffer

        StringBuilder sb = new StringBuilder();

        sb.append(123);
        sb.append("\n");
        for (int i = 0; i < 10; i++)
            sb.append("0");
        sb.append("qwe");

        System.out.println(sb.toString());

        System.out.println();

        String name = "Vasily";
        int i = 15;
        double d = 21.1;

        System.out.printf(Locale.ENGLISH, "name: %-10s, %d [%.10f]", name, i, d);
        String sFormatted = String.format("name: %-10s, %d [%.10f]", name, i, d);

    }
}

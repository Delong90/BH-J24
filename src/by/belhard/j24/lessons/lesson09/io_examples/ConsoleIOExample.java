package by.belhard.j24.lessons.lesson09.io_examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ConsoleIOExample {
    public static void main(String[] args) {
        String s = "";

        Map<String, Integer> map = new HashMap<>();

        // try-with-resources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter string and digit");
            s = br.readLine();
            while (!s.equals("e")) {

                String[] splitted = s.split(" "); // Vasily 25
                try {
                    int i = Integer.parseInt(splitted[1]);
                    map.put(splitted[0], i);
                    System.out.println(s);
                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    System.err.println("invalid input");
                }

                System.out.println("Enter string and digit");
                s = br.readLine();
            }
        } catch (IOException e) {
            System.err.println("IOException");
        }

        map.forEach((key, value) -> System.out.printf("%s:%d\n", key, value));

        System.out.println("END");
    }


}

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

            while (!s.equals("e")) {

                s = br.readLine();
                String[] splitted = s.split(" "); // Vasily 25
                int i = Integer.parseInt(splitted[1]);
                map.put(splitted[0], i);

                System.out.println(s);
            }
        } catch (IOException e) {
            System.err.println("IOException");
        }

        System.out.println("END");
    }


}

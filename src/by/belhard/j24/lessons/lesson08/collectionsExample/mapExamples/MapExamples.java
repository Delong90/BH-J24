package by.belhard.j24.lessons.lesson08.collectionsExample.mapExamples;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    private static final String PUNCTUATION_MARKS = ".,!?-+=_%~";

    public static void main(String[] args) {

        String input = "Mama, myla rAmu!..";

        Map<Character, Integer> result = calculateChars(input);

        for (Map.Entry<Character, Integer> e : result.entrySet()) {
            System.out.printf("%-3s: %2d\n", e.getKey(), e.getValue());
        }
    }

    private static Map<Character, Integer> calculateChars(String input) {

        Map<Character, Integer> result = new HashMap<>();

        char[] chars = input.toLowerCase().replaceAll(" ", "").replaceAll("[!,.]", "*").toCharArray();

        for (char c : chars) {
            /*if (PUNCTUATION_MARKS.contains(c + ""))
                c = '*';*/

            if (result.containsKey(c))
                result.put(c, (result.get(c) + 1));
            else
                result.put(c, 1);
        }

        return result;
    }
}

package by.belhard.j24.homeworks.hw7.task3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        boolean isOk;

        for (int i = 0; i < 10; i++) {

            do {
                isOk = set.add(random.nextInt(100));
            } while (!isOk);
        }

        System.out.println(set.size());
        System.out.println(set);

        int border = random.nextInt(100);
        System.out.println("border " + border);

        /*for (Integer i : set) {
            if (i < border)
                set.remove(i);
        }*/

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next < border)
                iterator.remove();
        }

        System.out.println(set.size());
        System.out.println(set);
    }
}

package by.belhard.j24.homeworks.hw2;

public class Task4 {

    public static void main(String[] args) {

        int salary1 = 100, salary2 = 200, salary3 = 100;

        int min = salary1, max = salary1;

        if (min > salary2)
            min = salary2;
        if (min > salary3)
            min = salary3;

        if (max < salary2)
            max = salary2;
        if (max < salary3)
            max = salary3;

        System.out.println(max - min);

        System.out.println("-----------------------");

        min = Math.min(salary1, Math.min(salary2, salary3));
        max = Math.max(salary1, Math.max(salary2, salary3));
        System.out.println(max - min);
    }
}

package by.belhard.j24.lessons.lesson07.abstractExample;

import java.util.ArrayList;
import java.util.List;

public class AbstractExample {

    public static void main(String[] args) {

        Employee worker1 = new Worker("Vasily", 54, "pick-axe");
        Employee manager1 = new Manager("Olga", 22, 12345);
        Employee manager2 = new Manager("Vasily", 22, 12345);
        Employee manager3 = new Manager("Olga", 22, 12346);

        worker1.doWork();
        manager1.doWork();

        System.out.println(worker1.getName());

        System.out.println(worker1.compareTo(manager1));
        System.out.println(worker1.compareTo(manager2));
        System.out.println(manager1.compareTo(manager3));

        if (worker1 instanceof Manager)
            System.out.println(((Manager) worker1).getPhone());

        List<Employee> list = new ArrayList<>();
        list.add(worker1);
        list.add(manager1);
        list.add(manager2);
        list.add(manager3);

        System.out.println(list.get(0));
        System.out.println(list.size());


    }
}

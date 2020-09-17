package by.belhard.j24.lessons.lesson07.abstractExample;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = o1.getAge() - o2.getAge();
        }

        return result;
    }
}

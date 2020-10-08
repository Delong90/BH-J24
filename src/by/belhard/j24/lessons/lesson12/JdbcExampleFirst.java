package by.belhard.j24.lessons.lesson12;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JdbcExampleFirst {

    public static void main(String[] args) {

        DatabaseHandler dbHandler = new DatabaseHandler();

        List<Person> people = new ArrayList<>();

        try {
            people = dbHandler.selectAllPersons();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        people.forEach(System.out::println);
        System.out.println();
        Department departmentQA = new Department(2, "QAdepartment", 0);
        List<Person> qaEmployees = people
                .stream()
                .filter(p -> p.getDepartment().equals(departmentQA))
                .collect(Collectors.toList());
        qaEmployees.forEach(System.out::println);

        /*try {
            dbHandler.insertNewPerson();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            dbHandler.updatePerson();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            dbHandler.deletePerson();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }
}

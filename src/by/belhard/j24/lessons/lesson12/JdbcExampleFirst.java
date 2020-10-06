package by.belhard.j24.lessons.lesson12;

import java.sql.SQLException;

public class JdbcExampleFirst {

    public static void main(String[] args) {

        DatabaseHandler dbHandler = new DatabaseHandler();

        try {
            dbHandler.insertNewPerson();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

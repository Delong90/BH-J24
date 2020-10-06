package by.belhard.j24.lessons.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandler {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/bh24?serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static final String INSERT_NEW_PERSON_QUERY =
            "insert into persons value (null, ?, ?, ?, default, ?)";

    private Connection connection;

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Connection getConnection() throws SQLException {

        if (connection == null) {
            Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            this.connection = connection;
        }

        return connection;
    }

    public void insertNewPerson() throws SQLException {

        System.out.println("Enter name, age, sex(1/0), departmentId");
        try {
            String s = reader.readLine();


        } catch (IOException e) {
            e.printStackTrace();
        }

        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        statement.execute(INSERT_NEW_PERSON_QUERY);
    }
}

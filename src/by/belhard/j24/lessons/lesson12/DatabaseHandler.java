package by.belhard.j24.lessons.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/bh24?serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static final String INSERT_NEW_PERSON_QUERY =
            "insert into persons value (null, '%s', %d, %d, default, %d)";
    private static final String UPDATE_PERSON_QUERY =
            "update persons set age = ? where name = ?;";
    private static final String DELETE_PERSON_QUERY =
            "delete from persons where id = ?;";

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

        String query = ";";

        System.out.println("Enter name, age, sex(1/0), departmentId");
        try {
            String s = reader.readLine();
            String[] splitted = s.split(" ");

            query = String.format(INSERT_NEW_PERSON_QUERY,
                    splitted[0],
                    Integer.parseInt(splitted[1]),
                    Integer.parseInt(splitted[2]),
                    Integer.parseInt(splitted[3]));

        } catch (IOException e) {
            e.printStackTrace();
        }

        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        statement.execute(query);
    }

    public void updatePerson() throws SQLException {

        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PERSON_QUERY);
        String[] splitted = {};

        System.out.println("Enter name and new age value");
        try {
            String s = reader.readLine();
            splitted = s.split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        preparedStatement.setString(2, splitted[0]);
        preparedStatement.setInt(1, Integer.parseInt(splitted[1]));

        preparedStatement.execute();
    }

    public void deletePerson() throws SQLException {

        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PERSON_QUERY);
        String s = "";

        System.out.println("Enter id to delete");
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        preparedStatement.setInt(1, Integer.parseInt(s));

        preparedStatement.execute();
    }

    public List<Person> selectAllPersons() throws SQLException {

        List<Person> result = new ArrayList<>();
        Connection connection = getConnection();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(
                "select p.id as pid, p.name, p.age, p.sex, p.date, " +
                        "d.id as did, d.department, d.salary" +
                        " from persons p left join departments d on p.id_department = d.id");

        while (resultSet.next()) {
            String name = resultSet.getString("name");

            int did = resultSet.getInt("did");
            String departmentTitle = resultSet.getString("department");
            int salary = resultSet.getInt("salary");

            Department department = new Department(did, departmentTitle, salary);

            int pid = resultSet.getInt("pid");
            int age = resultSet.getInt("age");
            boolean sex = resultSet.getBoolean("sex");
            LocalDate date = resultSet.getDate("date").toLocalDate();

            Person person = new Person(pid, name, age, sex, date, department);

            result.add(person);
        }

        return result;
    }
}

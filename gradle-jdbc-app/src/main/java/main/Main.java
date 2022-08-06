package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    private static String driver = "org.postgresql.Driver";
    private static String url = "jdbc:postgresql://localhost:5432/gradlejdbcdb";
    private static String username = "postgres";
    private static String password = "12345";
    private static String sql = "insert into student(age,name,surname)  values(?,?,?)";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, 20);
        statement.setString(2, "Alisa");
        statement.setString(3,"Aslan");
        int exc = statement.executeUpdate();
        System.out.println(exc);
        connection.close();
    }


}

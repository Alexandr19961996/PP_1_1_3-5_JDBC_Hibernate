package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/users";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "A1E53NMSad_";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Class.forName(DB_DRIVER);
            System.out.println("Connection OPENED");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection ERROR");
            e.printStackTrace();
        }
        return connection;
    }

    public static void connectionClose(Connection connection) {
        try {
            connection.close();
            System.out.println("Connection CLOSED");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
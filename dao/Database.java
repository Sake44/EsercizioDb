package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
    private static String jdbcURL = "jdbc:mysql://127.0.0.1:3306/mydb";
    private static String jdbcUsername = "root";
    private static String password = "@AtonSQL1234"; 
    private static String driver = "com.mysql.cj.jdbc.Driver";

    public Database() {

    }

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        conn = DriverManager.getConnection(jdbcURL, jdbcUsername, password);
        return conn;
    }
        
}

package web;
import java.sql.Connection;
import java.sql.SQLException;


import dao.Database;


public class GestioneCatalogo {
    public static void main(String[] args) throws SQLException {
        Connection conn = Database.getConnection();

        if (conn != null) {
            System.out.println("Database connection successful");
        }
    }


}

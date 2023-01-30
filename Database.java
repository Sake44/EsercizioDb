import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static String url = "jdbc:mysql://127.0.0.1:3306/mydb";
    private static String username = "root";
    private static String password = "@AtonSQL1234";
    private static String query = "SELECT * FROM computers";
    private static String driver = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
            
        try(Connection connection = DriverManager.getConnection(url,username,password)) {

            Class.forName(driver); 
            Statement statement =connection.createStatement();  
            ResultSet resultSet = statement.executeQuery(query); 

            while(resultSet.next())  {
      
               for(int i = 1; i <= 5; i++) {
                    System.out.println(resultSet.getString(i));
               }
            }     
                
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver class not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error occured while executing query: " + query);
            e.printStackTrace();
        } 
    }

}

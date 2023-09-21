package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    private static final String DATABASE_NAME = "khutro";
    
    public static void main(String[] args)  {

        try (Connection connection = DriverManager.getConnection(DB_URL + DATABASE_NAME, DB_USER, DB_PASSWORD)){
            Statement stmt;

//            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");

            System.out.println("Creating database...");
            stmt = connection.createStatement();

            String sql = "INSERT INTO room " +
                    "VALUES (1, 'a', 'a', 1, null, null, null, 'a', null)";
            stmt.executeUpdate(sql);            
            
            System.out.println("Inserted records into the table...");
            System.out.println("Insert data success");
            
        } catch(SQLException se){
        }
        System.out.println("Done!");
    }
}






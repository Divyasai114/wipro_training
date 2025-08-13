import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sampledb";
        String user = "root";
        String password = "DivyaSai@248";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Successful!");

            // Create statement
            Statement stmt = conn.createStatement();

            // Insert a row (NEW LINE HERE)
            stmt.executeUpdate("INSERT INTO users (username, email) VALUES ('Alice', 'alice@example.com')");

            // Select all rows from users table
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // Display results
            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id") +
                    ", Username: " + rs.getString("username") +
                    ", Email: " + rs.getString("email")
                );
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

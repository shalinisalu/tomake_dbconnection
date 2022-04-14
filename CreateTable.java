import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;  
   
public class CreateTable {  
   
    public static void createNewTable() {  
        
        String url = "jdbc:sqlite:C://sqlite/test.db";  
          
        // SQL statement for creating a new table  
        String sql = "CREATE TABLE IF NOT EXISTS movie (\n"  
                + " moviename text NOT NULL,\n"  
                + " actor_name text NOT NULL,\n" 
                + " actress_name text NOT NULL,\n"
                + " director_name text NOT NULL,\n"
                + " date real\n"  
                + ");";  
          
        try{  
            Connection conn = DriverManager.getConnection(url);  
            Statement stmt = conn.createStatement();  
            stmt.execute(sql);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
   
     
    public static void main(String[] args) {  
        createNewTable();  
    }  
   
}  
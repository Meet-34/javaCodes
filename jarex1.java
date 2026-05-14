import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jarex1 {
    public static void main(String[] args) {
        try {
            //? 1.Load Driver 
            // Class.forName("com.mysql.cj.jdbc.Driver");

            //? 2.Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/javaclass",
                "root",
                "root");
            
            System.out.println("Connection created");

            //? 3.Create Statement 
            Statement stmt = con.createStatement();

            //executeUpdate() -> only updates and does not expect anything in return 
            // whereas executeQuery() -> expects something in return therefore used in read.

            //? 4.Execute Query
            //a. Create Data
            //stmt.executeUpdate("insert into students values(2, 'Bob', 9)");

            //b. Update Data
            stmt.executeUpdate("update students set marks = 90 where roll = 2");

            //c. Delete Data 
            // stmt.executeUpdate("delete from students where roll = 2");

            //d. Read Data
            ResultSet rs = stmt.executeQuery("select * from students");

            System.out.println("Query is done. Now printing the results...");
            System.out.println("Roll Name Marks");

            //? 5.Process Result
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }

            //? 6.Close
            con.close();
            System.out.println("Closing the Database connection");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

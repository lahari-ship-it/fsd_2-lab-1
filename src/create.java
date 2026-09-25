import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class create {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/u1", "root", "lahari@1508");

            Statement st = con.createStatement();
            st.execute("CREATE TABLE IF NOT EXISTS emp (" +
                    "emp_id INT PRIMARY KEY," +
                    "emp_name VARCHAR(50)," +
                    "job VARCHAR(50)," +
                    "salary INT," +
                    "department VARCHAR(50))");

            System.out.println("Table created (or already exists)!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

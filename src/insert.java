import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/mysql1", "root", "lahari@1508");

            Statement st = con.createStatement();
            st.execute("INSERT INTO emp (id,name,salary) " +
                    "VALUES (1, 'Lahari', '4000')");

            System.out.println("Record inserted!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
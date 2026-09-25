import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updatedata {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/u1", "root", "lahari@1508");

            Statement st = con.createStatement();
            st.execute("UPDATE emp SET salary = 5000  WHERE emp_id = 2");

            System.out.println("Record updated!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

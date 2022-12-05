import java.sql.*;

public class Connectionprog {
    static Connection conn;

    public static Connection createc() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "Original#12";
            String url = "jdbc:mysql://localhost:3306/student";
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}

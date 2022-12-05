import java.sql.*;

public class Studentdu {
    public static boolean insertstudentdetailsintodb(Student stu) {
        boolean f = false;
        try {
            Connection conn = Connectionprog.createc();
            String query = "insert into studetails(sno,name,rolno,sem,course,contact) values(?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, stu.getStudentsno());
            pstmt.setString(2, stu.getStudentName());
            pstmt.setInt(3, stu.getStudentrollnumber());
            pstmt.setInt(4, stu.getStudentsem());
            pstmt.setString(5, stu.getStudentcourse());
            pstmt.setLong(6, stu.getStudentcontact());

            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deletestudentdetailsfromdb(String name) {
        boolean f = false;
        try {
            Connection conn = Connectionprog.createc();
            String query = "delete from studetails where name =?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);

            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static void showallstudentdetails() {

        try {
            Connection conn = Connectionprog.createc();
            String query = "select * from studetails";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int sno = rs.getInt(1);
                String name = rs.getString(2);
                int rolno = rs.getInt(3);
                int sem = rs.getInt(4);
                String course = rs.getString(5);
                long contact = rs.getLong(6);

                System.out.println(
                        "sno: " + sno + " name: " + name + " rollnumber: " + rolno + " semester: " + sem + " course: "
                                + course + " contact: " + contact);
                System.out.println("-----------------------------------------------------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean updatestudentdetails(String name, int newsem) {
        boolean f = false;
        try {
            Connection conn = Connectionprog.createc();
            String query = "update studetails set sem=? where name=?";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, newsem);
            pstmt.setString(2, name);

            pstmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

}

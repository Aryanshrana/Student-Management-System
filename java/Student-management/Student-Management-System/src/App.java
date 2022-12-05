import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("welcome to student management system ");

        while (true) {
            System.out.println("press 1 to ADD student");
            System.out.println("press 2 to delete student");
            System.out.println("press 3 to show student details");
            System.out.println("press 4 to update student details");
            System.out.println("press 5 to exit");

            int c = Integer.parseInt(br.readLine());

            if (c == 1) {

                System.out.println("enter sno");
                int sno = Integer.parseInt(br.readLine());

                System.out.println("enter your name");
                String name = br.readLine();

                System.out.println("enter your roll number");
                int rolno = Integer.parseInt(br.readLine());

                System.out.println("enter your semester");
                int sem = Integer.parseInt(br.readLine());

                System.out.println("enter your course");
                String course = br.readLine();

                System.out.println("enter your contact number");
                long contact = Long.parseLong(br.readLine());

                Student stu = new Student(sno, name, rolno, sem, course, contact);
                boolean ans = Studentdu.insertstudentdetailsintodb(stu);

                if (ans) {
                    System.out.println("student details:" + stu);
                } else {
                    System.out.println("error :");
                }

            }

            else if (c == 2) {
                System.out.println("enter student name to delete");
                String name = br.readLine();
                boolean f = Studentdu.deletestudentdetailsfromdb(name);
                if (f) {
                    System.out.println("student of" + name + "deleted");
                } else {
                    System.out.println("error: ");
                }
            }

            else if (c == 3) {
                Studentdu.showallstudentdetails();
            } else if (c == 4) {
                System.out.println("enter student name whose details is to be updated");
                String name = br.readLine();
                System.out.println("enter new update semester");
                int newsem = Integer.parseInt(br.readLine());
                boolean f = Studentdu.updatestudentdetails(name, newsem);

                if (f) {
                    System.out.println("semester has been updated");
                } else {
                    System.out.println("error");
                }

            } else if (c == 5) {
                break;
            } else {

            }
        }
    }
}

public class Student {
    private int sno;
    private String name;
    private int rolno;
    private int sem;
    private String course;
    private long contact;

    public void setStudentsno(int sno) {
        this.sno = sno;
    }

    public int getStudentsno() {
        return sno;
    }

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String name) {
        this.name = name;
    }

    public int getStudentrollnumber() {
        return rolno;
    }

    public void setStudentrollnumber(int rolno) {
        this.rolno = rolno;
    }

    public int getStudentsem() {
        return sem;
    }

    public void setStudentsem(int sem) {
        this.sem = sem;
    }

    public String getStudentcourse() {
        return course;
    }

    public void setStudentcourse(String course) {
        this.course = course;
    }

    public long getStudentcontact() {
        return contact;
    }

    public void setStudentcontact(long contact) {
        this.contact = contact;
    }

    Student() {

    }

    Student(int sno, String name, int rolno, int sem, String course, long contact) {
        this.sno = sno;
        this.name = name;
        this.rolno = rolno;
        this.sem = sem;
        this.course = course;
        this.contact = contact;
    }
}

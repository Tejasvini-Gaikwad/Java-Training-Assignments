public class Student extends Person{
    private int roll_no;
    private String course;
    private String department;
    public Student(String Name, int Age, int roll_no, String course, String department) {
        super(Name, Age);
        this.roll_no = roll_no;
        this.course = course;
        this.department = department;
    }
    public int getRollNo() {
        return roll_no;
    }

    public void setRollNo(int rollNo) {
        this.roll_no = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

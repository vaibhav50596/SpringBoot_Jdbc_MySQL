package FirstApp.Model;

public class Student {
    private Integer studentId;
    private String studentName;
    private String studentCourse;

    private String studentEmail;

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentEmail() {
        return studentEmail;
    }
}

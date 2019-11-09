package FirstApp.Dao;

import FirstApp.Model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setStudentId(rs.getInt("STUDENT_ID"));
        student.setStudentName(rs.getString("STUDENT_NAME"));
        student.setStudentEmail(rs.getString("STUDENT_EMAIL"));
        student.setStudentCourse(rs.getString("STUDENT_COURSE"));
        return student;
    }
}

package FirstApp.Service;

import FirstApp.Dao.StudentDao;
import FirstApp.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "studentService") //when we annotate something, it converts to camel casing..
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public Student getStudentData(Integer id) {
        return studentDao.getStudent(id);
    }
}

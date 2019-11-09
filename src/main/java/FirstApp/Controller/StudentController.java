package FirstApp.Controller;

import FirstApp.Dao.StudentDao;
import FirstApp.Model.Student;
import FirstApp.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService; //it will throw bean not found if you don't annotate service

    @GetMapping(value = "/getStudent/{id}")
    //@RequestMapping(value = "/getStudent/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("id") int id) {
        Student student = studentService.getStudentData(id);
        return student;
    }
}

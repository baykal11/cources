package kg.megacom.cources.cources.sevices;

import kg.megacom.cources.cources.models.entities.Course;
import kg.megacom.cources.cources.models.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    Student saveStudent(Student student);
    List<Student> getStudentList();

    Student addCourseToStudent(Student student, Course course);
}

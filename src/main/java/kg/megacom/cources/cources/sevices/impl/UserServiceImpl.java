package kg.megacom.cources.cources.sevices.impl;

import kg.megacom.cources.cources.models.dao.StudentRepo;
import kg.megacom.cources.cources.models.entities.Course;
import kg.megacom.cources.cources.models.entities.Student;
import kg.megacom.cources.cources.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepo.findAll();
    }

    @Override
    public Student addCourseToStudent(Student student, Course course) {
        List<Course> courseList = student.getCourseList();
        courseList.add(course);
        student.setCourseList(courseList);
        student = studentRepo.save(student);
        return student;
    }

}

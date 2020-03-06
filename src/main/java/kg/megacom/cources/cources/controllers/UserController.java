package kg.megacom.cources.cources.controllers;

import kg.megacom.cources.cources.models.dto.CourseDto;
import kg.megacom.cources.cources.models.dto.StudentDto;
import kg.megacom.cources.cources.models.dto.UserDto;
import kg.megacom.cources.cources.models.entities.Course;
import kg.megacom.cources.cources.models.entities.Student;
import kg.megacom.cources.cources.models.entities.User;
import kg.megacom.cources.cources.models.mappers.ClassMapper;
import kg.megacom.cources.cources.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/student/save")
    ResponseEntity<?> saveStudent(@RequestBody StudentDto studentDto){
        Student student = ClassMapper.INSTANCE.studentDtoToStudent(studentDto);
        student = userService.saveStudent(student);
        studentDto = ClassMapper.INSTANCE.studentToStudentDto(student);

        return ResponseEntity.ok(studentDto);
    }

    @GetMapping("/student/get")
    ResponseEntity<?> getStudentList(){
        List<Student> studentList = userService.getStudentList();
        List<StudentDto> studentDtoList = ClassMapper.INSTANCE.studentListToStudentDtoList(studentList);
        return ResponseEntity.ok(studentDtoList);
    }

    @PostMapping("student/add/course")
    ResponseEntity<?>addCourseToStudent(@RequestBody StudentDto studentDto, CourseDto courseDto){
        Student student = ClassMapper.INSTANCE.studentDtoToStudent(studentDto);
        Course course = ClassMapper.INSTANCE.courseDtoToCourse(courseDto);
        student = userService.addCourseToStudent(student,course);
        studentDto = ClassMapper.INSTANCE.studentToStudentDto(student);
        return ResponseEntity.ok(studentDto);
    }

}

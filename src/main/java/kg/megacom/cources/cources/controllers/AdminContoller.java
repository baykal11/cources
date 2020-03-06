package kg.megacom.cources.cources.controllers;

import kg.megacom.cources.cources.models.dto.CourseDto;
import kg.megacom.cources.cources.models.dto.RoleDto;
import kg.megacom.cources.cources.models.dto.TeacherDto;
import kg.megacom.cources.cources.models.dto.UserDto;
import kg.megacom.cources.cources.models.entities.Course;
import kg.megacom.cources.cources.models.entities.Role;
import kg.megacom.cources.cources.models.entities.Teacher;
import kg.megacom.cources.cources.models.entities.User;
import kg.megacom.cources.cources.models.mappers.ClassMapper;
import kg.megacom.cources.cources.sevices.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")

public class AdminContoller {
    @Autowired
    private AdminService adminService;


    @GetMapping("/user/get")
    ResponseEntity<?> getUserList(){
        List<User> userList = adminService.getUserList();
        List<UserDto> userDtoList = ClassMapper.INSTANCE.userListToUserDtoList(userList);
        return ResponseEntity.ok(userDtoList);
    }
    @PostMapping("/user/save")
    ResponseEntity<?> saveUser(@RequestBody UserDto userDto){
        User user = ClassMapper.INSTANCE.userDtoToUser(userDto);
        user = adminService.saveUser(user);
        userDto = ClassMapper.INSTANCE.userToUserDto(user);
        return ResponseEntity.ok(userDto);
    }

    @GetMapping("/user/role/get")
    ResponseEntity<?> getRoleList(){
        return ResponseEntity.ok(adminService.getRoleList());
    }

    @PostMapping("/user/role/save")
    ResponseEntity<?> saveRole(@RequestBody RoleDto roleDto){
        Role role = ClassMapper.INSTANCE.roleDtoToRole(roleDto);
        role = adminService.saveRole(role);
        roleDto = ClassMapper.INSTANCE.roleToRoleDto(role);
        return ResponseEntity.ok(roleDto);
    }
    @PostMapping("/teacher/save")
    ResponseEntity<?> saveTeacher(@RequestBody TeacherDto teacherDto){
        Teacher teacher = ClassMapper.INSTANCE.teacherDtoToTeacher(teacherDto);
        teacher = adminService.saveTeacher(teacher);
        teacherDto=ClassMapper.INSTANCE.teacherToTeacherDto(teacher);
        return ResponseEntity.ok(teacherDto);
    }

    @GetMapping("/teacher/get")
    ResponseEntity<?> getTeacherList(){
        List<Teacher> teacherList = adminService.getTeacherList();
        List<TeacherDto> teacherDtoList = ClassMapper.INSTANCE.teacherListToTeacherDtoList(teacherList);
        return ResponseEntity.ok(teacherDtoList);
    }
    @PostMapping("/course/save")
    ResponseEntity<?> saveCourse(@RequestBody CourseDto courseDto){
        Course course = ClassMapper.INSTANCE.courseDtoToCourse(courseDto);
        course = adminService.saveCourse(course);
        courseDto=ClassMapper.INSTANCE.courseToCourseDto(course);
        return ResponseEntity.ok(courseDto);
    }

    @GetMapping("/course/get")
    ResponseEntity<?> getCourseList(){
        List<Course> courseList = adminService.getCourseList();
        List<CourseDto> courseDtoList = ClassMapper.INSTANCE.courseListToCourseDtoList(courseList);
        return ResponseEntity.ok(courseDtoList);

    }


}

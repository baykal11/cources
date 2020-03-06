package kg.megacom.cources.cources.models.mappers;

import kg.megacom.cources.cources.models.dto.*;
import kg.megacom.cources.cources.models.entities.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClassMapper {
    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);

    Course courseDtoToCourse(CourseDto courseDto);
    CourseDto courseToCourseDto(Course course);
    Role roleDtoToRole(RoleDto roleDto);
    RoleDto roleToRoleDto(Role role);
    Student studentDtoToStudent(StudentDto studentDto);
    StudentDto studentToStudentDto(Student student);
    Teacher teacherDtoToTeacher(TeacherDto teacherDto);
    TeacherDto teacherToTeacherDto(Teacher teacher);
    User userDtoToUser(UserDto userDto);
    UserDto userToUserDto(User user);

    List<Course> courseDtoListToCourseList(List<CourseDto> courseDtoList);
    List<CourseDto> courseListToCourseDtoList(List<Course> courseList);
    List<Role> roleDtoListToRoleList(List<RoleDto> roleDtoList);
    List<RoleDto> roleListToRoleDtoList(List<Role> roleList);
    List<Student> studentDtoListToStudentList(List<StudentDto> studentDtoList);
    List<StudentDto> studentListToStudentDtoList(List<Student> studentList);
    List<Teacher> teacherDtoListToTeacherList(List<TeacherDto> teacherDtoList);
    List<TeacherDto> teacherListToTeacherDtoList(List<Teacher> teacherList);
    List<User> userDtoListToUserList(List<UserDto> userDtoList);
    List<UserDto> userListToUserDtoList(List<User> user);

}

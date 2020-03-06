package kg.megacom.cources.cources.sevices.impl;

import kg.megacom.cources.cources.models.dao.CourseRepo;
import kg.megacom.cources.cources.models.dao.RoleRepo;
import kg.megacom.cources.cources.models.dao.TeacherRepo;
import kg.megacom.cources.cources.models.dao.UserRepo;
import kg.megacom.cources.cources.models.entities.Course;
import kg.megacom.cources.cources.models.entities.Role;
import kg.megacom.cources.cources.models.entities.Teacher;
import kg.megacom.cources.cources.sevices.AdminService;
import kg.megacom.cources.cources.models.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    @Autowired
    private TeacherRepo teacherRepo;

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public User saveUser(User user) {
//        Role role = user.getRole();
//        System.out.println(role);
//        System.out.println(role.getId());
//        if(role.getId() == null){
//            role = roleRepo.save(role);
//            user.setRole(role);
//        }
        return userRepo.save(user);
    }

    @Override
    public List<Role> getRoleList() {
        return roleRepo.findAll();
    }

    @Override
    public List<User> getUserList() {
        return userRepo.findAll();
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    @Override
    public List<Teacher> getTeacherList() {
        return teacherRepo.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public List<Course> getCourseList() {
        return courseRepo.findAll();
    }

}

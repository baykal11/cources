package kg.megacom.cources.cources.sevices.impl;

import kg.megacom.cources.cources.models.dao.RoleRepo;
import kg.megacom.cources.cources.models.dao.UserRepo;
import kg.megacom.cources.cources.models.entities.Role;
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
}

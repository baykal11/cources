package kg.megacom.cources.cources.sevices;

import kg.megacom.cources.cources.models.entities.Role;
import kg.megacom.cources.cources.models.entities.User;

import java.util.List;

public interface AdminService {

    User saveUser(User user);

    List<Role> getRoleList();

    List<User> getUserList();

    Role saveRole(Role role);

}

package kg.megacom.cources.cources.controllers;

import kg.megacom.cources.cources.models.dto.RoleDto;
import kg.megacom.cources.cources.models.dto.UserDto;
import kg.megacom.cources.cources.models.entities.Role;
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
}

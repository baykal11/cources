package kg.megacom.cources.cources.models.dto;

import kg.megacom.cources.cources.models.entities.Role;
import lombok.Data;

import javax.persistence.*;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String login;
    private String password;
    private RoleDto roleDto;
}

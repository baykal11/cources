package kg.megacom.cources.cources.models.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class TeacherDto {
    private Long id;
    private String name;

}

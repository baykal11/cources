package kg.megacom.cources.cources.models.dto;

import kg.megacom.cources.cources.models.entities.Course;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data

public class StudentDto {
    private Long id;
    private String name;
    private List<CourseDto> courseDtoList;
}

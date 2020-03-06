package kg.megacom.cources.cources.models.dto;

import kg.megacom.cources.cources.models.entities.Teacher;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class CourseDto {

    private Long id;

    private String name;
    private Date start_date;
    private Date end_date;

    private TeacherDto teacherDto;
}

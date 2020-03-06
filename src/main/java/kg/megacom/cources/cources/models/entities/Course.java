package kg.megacom.cources.cources.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Date start_date;
    private Date end_date;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

}

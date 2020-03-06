package kg.megacom.cources.cources.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable(name = "courses_students", joinColumns = @JoinColumn(name = "crs_crs_id"), inverseJoinColumns = @JoinColumn(name = "std_std_id"))
    private List<Course> courseList;
}

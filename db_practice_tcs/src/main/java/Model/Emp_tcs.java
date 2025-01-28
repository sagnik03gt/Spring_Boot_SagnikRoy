package Model;


import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
public class Emp_tcs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name", unique = false)
    private String name;

    @Column(name = "Age",unique = false)
    private Integer age;
}

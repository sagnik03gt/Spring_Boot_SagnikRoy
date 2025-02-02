package Model;


import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
public class Emp_tcs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @Column(name = "Name", unique = false)
    private String name;

//    @Column(name = "Age",unique = false)
    private Integer age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }


}

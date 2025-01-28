package com.example.db_demo.Model;

import jakarta.persistence.*;
import lombok.Data;


//@Getter
//@Setter
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "User_name", unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}



//}

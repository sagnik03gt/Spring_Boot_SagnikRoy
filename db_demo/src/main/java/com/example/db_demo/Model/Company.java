package com.example.db_demo.Model;


import jakarta.persistence.*;

@Entity
public class Company {

    @Column(name = "Company_id",unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Comany_name",unique = true)
    private String Company_name;

    @Column(name = "Company_type",unique = false)
    private String Company_type;

    @Column(name = "Location")
    private String Location;

    public void setCompany_name(String Company_name){
        this.Company_name=Company_name;
    }
    public String getCompany_name(){
        return Company_name;
    }
    public void setCompany_type(String Company_type){
        this.Company_type=Company_type;
    }
    public String getCompany_type(){
        return Company_type;
    }

    public void setLocation(String Location){
        this.Location=Location;
    }
    public String getLocation(){
        return Location;
    }


}

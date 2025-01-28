package com.example.db_demo.DTO;

public class CompanyDto {
    private String Company_name;
    private String Company_type;
    private String Location;

    public void setCompany_name(String Comany_name){
        this.Company_name=Comany_name;
    }
    public String getCompany_name(){
        return Company_name;
    }
    public void setCompany_type(String Comany_type){
        this.Company_type=Comany_type;
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

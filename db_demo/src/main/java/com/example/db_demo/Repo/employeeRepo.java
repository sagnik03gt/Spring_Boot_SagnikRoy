package com.example.db_demo.Repo;

import com.example.db_demo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepo extends JpaRepository<Employee,Integer> {

}

package com.example.db_demo.ServiceImp;

import com.example.db_demo.DTO.EmployeeDto;
import com.example.db_demo.Model.Employee;
import com.example.db_demo.Repo.employeeRepo;
import com.example.db_demo.Service.EmplyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeSerImpl implements EmplyeeService {

    @Autowired
    employeeRepo empl;
    @Override
    public ResponseEntity<?> addUser(EmployeeDto emp) {
        Employee em = new Employee();
        em.setUsername(emp.getUsername());
        em.setPassword(emp.getPassword());
        empl.save(em);
        return ResponseEntity.ok("user added");
    }

    @Override
    public ResponseEntity updateUser(Integer id, String pass) {
        Optional<Employee> empOp = empl.findById(id);
        if(empOp.isPresent()){
            Employee emp = empOp.get();
            emp.setPassword(pass);
            empl.save(emp);

            return ResponseEntity.ok("Updated");
        }
        return ResponseEntity.notFound().build();
    }
}

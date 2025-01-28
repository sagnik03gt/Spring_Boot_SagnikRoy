package com.example.db_demo.Service;

import com.example.db_demo.DTO.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service

public interface EmplyeeService {

    public ResponseEntity<?> addUser(@RequestBody EmployeeDto emp);
    public ResponseEntity updateUser(@PathVariable Integer id, @PathVariable String pass);
}

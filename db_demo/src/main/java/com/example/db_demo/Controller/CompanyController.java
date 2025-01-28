package com.example.db_demo.Controller;

import com.example.db_demo.DTO.CompanyDto;
import com.example.db_demo.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {


    @Autowired
    CompanyService companyService;

    @PostMapping("/addCompany")
    public ResponseEntity<?> addCompany(@RequestBody CompanyDto dto){
        return companyService.addCompany(dto);
    }
    @PutMapping("/updateLoc/{id}/{loc}")
    public ResponseEntity<?> updateCompany(@PathVariable Integer id, @PathVariable String loc){
        return companyService.updateCompany(id,loc);
    }
}

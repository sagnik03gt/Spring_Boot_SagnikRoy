package com.example.db_demo.Service;

import com.example.db_demo.DTO.CompanyDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public interface CompanyService {
    public ResponseEntity<?> addCompany(@RequestBody CompanyDto dto);
    public ResponseEntity<?> updateCompany(Integer id,String loc);
}

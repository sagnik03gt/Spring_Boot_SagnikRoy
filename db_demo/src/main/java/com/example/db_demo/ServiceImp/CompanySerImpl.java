package com.example.db_demo.ServiceImp;

import com.example.db_demo.DTO.CompanyDto;
import com.example.db_demo.Model.Company;
import com.example.db_demo.Repo.companyRepo;
import com.example.db_demo.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanySerImpl implements CompanyService {

    @Autowired
    companyRepo comp;
    @Override
    public ResponseEntity<?> addCompany(CompanyDto dto) {
        Company company = new Company();
        company.setCompany_name(dto.getCompany_name());
        company.setCompany_type(dto.getCompany_type());
        company.setLocation(dto.getLocation());

        comp.save(company);
        return ResponseEntity.ok("Company added");
    }

    @Override
    public ResponseEntity<?> updateCompany(Integer id, String loc) {
//        return null;
        Optional<Company> compy = comp.findById(id);
        if(compy.isPresent()){
            Company mycom = compy.get();
            mycom.setLocation(loc);

            comp.save(mycom);
            return ResponseEntity.ok("Location Updated");
        }
        return ResponseEntity.notFound().build();
    }

}

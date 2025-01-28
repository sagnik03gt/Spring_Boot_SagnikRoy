package com.example.db_demo.Repo;

import com.example.db_demo.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface companyRepo extends JpaRepository<Company,Integer> {
}

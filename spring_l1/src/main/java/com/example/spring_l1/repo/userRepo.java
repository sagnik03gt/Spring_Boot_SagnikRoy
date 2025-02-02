package com.example.spring_l1.repo;

import com.example.spring_l1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface userRepo extends JpaRepository<User,Integer> {
    public List<User> findByName(String name);

//    public :ist
}

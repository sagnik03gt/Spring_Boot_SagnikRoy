package com.example.spring_l1.repo;

import com.example.spring_l1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends JpaRepository<User,Integer> {

    //CUSTOM METHOD
    public List<User> findByName(String name);


    //JPQL
    @Query("select u from User u WHERE u.name=:n")
    public User findByPersonalName(@Param("n") String name);

    @Query("select u from User u where u.age>=:a")
    public List<User> findByAge(@Param("a") Integer age);


    //NATIVE SQL
    @Query(value = "select * from user",nativeQuery = true)
    public List<User> getUsers();
}

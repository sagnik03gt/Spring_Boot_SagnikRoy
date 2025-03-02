package com.example.spring_l1.Services;


import com.example.spring_l1.model.User;
import com.example.spring_l1.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Component
@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    public ResponseEntity<User> addUser(User u){

        userRepo.save(u);
        return ResponseEntity.of(Optional.of(u));
    }
    public ResponseEntity<String> deleteUser(int id){
        Optional<User> deluser = userRepo.findById(id);
        if(deluser.isPresent()){
            User u1 = deluser.get();
            userRepo.delete(u1);
            System.out.println(u1+" deleted");
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    public ResponseEntity<?> updateUser(User user,int id){
        Optional<User> findUser = userRepo.findById(id);
        if(findUser.isPresent()){
            User u1 = findUser.get();
            u1.setName(user.getName());
            u1.setAge(user.getAge());
            userRepo.save(u1);
            return ResponseEntity.ok("User updated! Please check database");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}

package com.project.reflect.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserRepository userRepo;

    public UserController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }


    @GetMapping("/{id}")
    public User getUser(@PathVariable long id){
        return userRepo.findById(id).get();
    }


}

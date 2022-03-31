package com.project.reflect.Controller;


import com.project.reflect.Model.User;
import com.project.reflect.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

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


 /*   TODO 

 @PostMapping("/addUser")
    public User addUser(@RequestBody User user){


    }*/



}

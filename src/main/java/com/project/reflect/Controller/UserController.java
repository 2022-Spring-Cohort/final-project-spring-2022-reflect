package com.project.reflect.Controller;


import com.project.reflect.Model.User;
import com.project.reflect.Repository.SessionRepository;
import com.project.reflect.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserRepository userRepo;
    private SessionRepository sessionRepo;

    public UserController(UserRepository userRepo, SessionRepository sessionRepo) {
        this.userRepo = userRepo;
        this.sessionRepo = sessionRepo;
    }

    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return userRepo.findAll();
    }

    @GetMapping("users/{id}")
    public User getUser(@PathVariable long id){
        User user = userRepo.findById(id).get();
        return user;
    }

    @PostMapping("users/addUser")
    public Iterable<User> addUser(@RequestBody User user) {
        userRepo.save(user);
        return userRepo.findAll();
    }


 /*   TODO 

 @PostMapping("/addUser")
    public User addUser(@RequestBody User user){


    }*/



}

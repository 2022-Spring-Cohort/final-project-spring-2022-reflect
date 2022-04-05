package com.project.reflect.Controller;

import com.project.reflect.Model.Comments;
import com.project.reflect.Model.Session;
import com.project.reflect.Model.User;
import com.project.reflect.Repository.SessionRepository;
import com.project.reflect.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class SessionController {
    private SessionRepository sessionRepo;
    private UserRepository userRepo;

    public SessionController(SessionRepository sessionRepo, UserRepository userRepo) {
        this.sessionRepo = sessionRepo;
        this.userRepo = userRepo;
    }

    @GetMapping("/sessions")
    public Iterable<Session> getSessions() {
        return sessionRepo.findAll();
    }

    @GetMapping("/sessions/{id}")
    public Session getSession(@PathVariable long id){
        return sessionRepo.findById(id).get();
    }

    @PostMapping("/users/{id}/addSession")
    public User addSessionToUser(@PathVariable long id, @RequestBody Session session) {
        User user = userRepo.findById(id).get();
        session.setUser(user);
        sessionRepo.save(session);
        return userRepo.findById(id).get();
    }



}
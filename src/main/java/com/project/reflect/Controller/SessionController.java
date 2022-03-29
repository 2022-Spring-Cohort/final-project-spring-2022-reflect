package com.project.reflect.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {
    private SessionRepository sessionRepo;

    public SessionController(SessionRepository sessionRepo) {
        this.sessionRepo = sessionRepo;
    }


    @GetMapping("/sessions")
    public Iterable<Session> getSessions() {
        return sessionRepo.findAll();
    }

    @GetMapping("/sessions/{id}")
    public Session getSession(@PathVariable long id){
        return sessionRepo.findById(id).get();
    }

    @PostMapping("/{id}/addSession/")
    public Session addSessionToUser(@PathVariable long id,@RequestBody Session session) {
        User user = userRepo.findById(id).get();
        //Need to add user to session
        return sessionRepo.findAll();
    }

}
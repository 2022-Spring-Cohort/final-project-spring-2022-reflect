package com.project.reflect.Controller;

import com.project.reflect.Model.Session;
import com.project.reflect.Model.Timer;
import com.project.reflect.Repository.SessionRepository;
import com.project.reflect.Repository.TimerRepository;
import com.project.reflect.Repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimerController {

    private TimerRepository timerRepo;
    private SessionRepository sessionRepo;

    public TimerController(TimerRepository timerRepo, SessionRepository sessionRepo) {
        this.timerRepo = timerRepo;
        this.sessionRepo = sessionRepo;
    }

    @GetMapping("/timers")
    public Iterable<Timer> getTimer() {
        return timerRepo.findAll();
    }

    @GetMapping("/timers/{id}")
    public Timer getTimer(@PathVariable long id){
        return timerRepo.findById(id).get();
    }


}

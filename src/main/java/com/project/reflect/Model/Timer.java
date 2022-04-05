package com.project.reflect.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Timer {
    @Id
    @GeneratedValue
    private Long id;
    private int minutes;

    @ManyToOne
    private User user;

    public Timer() {
    }

    public Timer(int minutes, User user) {
        this.minutes = minutes;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public int getMinutes() {
        return minutes;
    }

    public User getUser() {
        return user;
    }
}

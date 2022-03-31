package com.project.reflect.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Timer {
    @Id
    @GeneratedValue
    private Long id;
    private int minutes;
    private int seconds;

    public Timer() {
    }

    public Timer(Long id, int minutes, int seconds) {
        this.id = id;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Long getId() {
        return id;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}

package com.project.reflect.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Timer {
    @Id
    @GeneratedValue
    private Long id;
    private Double duration;

    public Timer() {
    }

    public Timer(Long id, Double duration) {
        this.id = id;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public Double getDuration() {
        return duration;
    }
}

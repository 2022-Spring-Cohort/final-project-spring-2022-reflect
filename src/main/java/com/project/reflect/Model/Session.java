package com.project.reflect.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

@Entity
public class Session {
    @Id
    @GeneratedValue
    private Long id;

    private String date;
    private int duration;
    private String note;


    @ManyToOne
    @JsonIgnore
    private User user;

    public Session() {
    }

    public Session(String date, int duration, String note, User user) {
        this.date = date;
        this.duration = duration;
        this.note = note;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }


    public String getNote() {
        return note;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {this.user = user;}

}

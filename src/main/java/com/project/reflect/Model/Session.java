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
    private LocalDate date;
    private int startTime;
    private int endTime;
    private String note;

    @ManyToOne
    @JsonIgnore
    private User user;

    public Session() {
    }

    public Session(LocalDate date, int startTime, int endTime, String note, User user) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.note = note;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public String getNote() {
        return note;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {this.user = user;}

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public void setTime(String time) {
//        this.time = time;
//    }
//    public  Collection<Comments> getComments(){
//        return comments;
//    }
}

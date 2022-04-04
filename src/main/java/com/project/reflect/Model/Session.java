package com.project.reflect.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Session {
    @Id
    @GeneratedValue
    private Long id;
    private String date;
    private String time;
    private String comment;

    @ManyToOne
    private User user;

//    @ElementCollection
//    private Collection<Comments> comments;

    public Session() {
    }

    public Session(String date, String time, String comment, User user) {
        this.date = date;
        this.time = time;
        this.comment = comment;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getComment() {
        return comment;
    }

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

package com.project.reflect.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Collection <MindsetCards> mindsetCards;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Session> sessions;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Timer> timers;


    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Session> getSessions() {
        return sessions;
    }

    public Collection<Timer> getTimers() {
        return timers;
    }
}

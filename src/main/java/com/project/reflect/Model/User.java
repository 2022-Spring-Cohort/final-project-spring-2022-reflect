package com.project.reflect.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;



    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<MindsetCards> mindsetCardsWins;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<MindsetCards> mindsetCardsWhy;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Session> sessions;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Timer> timers;




    public User(String name) {
        this.id = id;
        this.name = name;
        this.sessions = sessions;
        this.timers = timers;
        this.mindsetCardsWhy = mindsetCardsWhy;
        this.mindsetCardsWhy = mindsetCardsWins;

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



    public void addMindsetCardsWhy(MindsetCards newCard) {
        this.mindsetCardsWhy.add(newCard);
    }


    public void addMindsetCardsWins(MindsetCards newCard) {
        this.mindsetCardsWins.add(newCard);
    }

    public Collection <MindsetCards> getMindsetCardsWhy() {
        return mindsetCardsWhy;
    }


    public Collection <MindsetCards> getMindsetCardsWins() {
        return mindsetCardsWins;
    }




}

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
    private Collection<MindsetCardsWhy> mindsetCardsWhy;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<MindsetCardsWins> mindsetCardsWins;

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
        this.mindsetCardsWins = mindsetCardsWins;

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



    public void addMindsetCardsWhy(MindsetCardsWhy newCard) {
        mindsetCardsWhy.add(newCard);
    }


    public void addMindsetCardsWins(MindsetCardsWins newCard) {
        mindsetCardsWins.add(newCard);
    }

    public Collection <MindsetCardsWhy> getMindsetCardsWhy() {
        return mindsetCardsWhy;
    }


    public Collection <MindsetCardsWins> getMindsetCardsWins() {
        return mindsetCardsWins;
    }




}

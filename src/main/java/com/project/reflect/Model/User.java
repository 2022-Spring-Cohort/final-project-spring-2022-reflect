package com.project.reflect.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection <MindsetCards> mindsetCardsWhy;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection <MindsetCards> mindsetCardsWins;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Session> sessions;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Timer> timers;




    public User(String name) {
        this.id = id;
        this.name = name;
        this.mindsetCardsWhy = mindsetCardsWhy;
        this.mindsetCardsWins = mindsetCardsWins;
        this.sessions = sessions;
        this.timers = timers;
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


    public void getMindsetCardsWins(MindsetCardsWins newCard) {
        mindsetCardsWins.add(newCard);
    }





}


package com.project.reflect.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

@Entity
public abstract class MindsetCards {
    @Id
    @GeneratedValue
    private Long id;
    private String front;
    @ElementCollection
    private Collection <String> back;
    private String photo = "./images/fillerphoto.jpg";


    @ManyToOne
    @JsonIgnore
    private User user;


    public MindsetCards() {
    }

    public MindsetCards(User user, String photo, String front, String ... back) {
        this.user = user;
        this.front = front;
        this.back = Arrays.asList(back);
        this.photo=photo;
    }


    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getFront() {
        return front;
    }

    public Collection<String> getBack() {
        return back;
    }

    public void addBackCards(String newPhrase){
        back.add(newPhrase);
    }

    public void addFrontCard(String newPhrase){
        this.front=newPhrase;
    }

    public void updateFront(String newFront){
        front = newFront;
    }


    public void updateBack(String newBack){
        back.add(newBack);
    }

    public void updatePhoto(String newPhoto){
        this.photo=newPhoto;
    }

}


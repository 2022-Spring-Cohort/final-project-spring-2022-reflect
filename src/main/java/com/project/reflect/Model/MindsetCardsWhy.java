
package com.project.reflect.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class MindsetCardsWhy {
    @Id
    @GeneratedValue
    private Long id;
    private String front;
    private String back;
    private String photo = "./images/fillerphoto.jpg";



    @ManyToOne
    @JsonIgnore
    private User user;


    public MindsetCardsWhy() {
    }

    public MindsetCardsWhy(User user, String photo, String front, String back) {
        this.user = user;
        this.front = front;
        this.back = back;
        this.photo=photo;
    }


    public Long getId() {
        return id;
    }
    public Long getUserId(){
        return user.getId();
    }

    public User getUser() {
        return user;
    }

    public String getFront() {
        return front;
    }

    public String getBack() {
        return back;
    }
    public String getPhoto(){
        return photo;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addBackCard(String newPhrase){
        this.front=newPhrase;
    }

    public void addFrontCard(String newPhrase){
        this.front=newPhrase;
    }

    public void updateFront(String newFront){
        this.front = newFront;
    }


    public void updateBack(String newBack){
        this.back = newBack;
    }

    public void updatePhoto(String newPhoto){
        this.photo=newPhoto;
    }

}


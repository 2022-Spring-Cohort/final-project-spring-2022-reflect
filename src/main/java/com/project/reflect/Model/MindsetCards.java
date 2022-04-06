package com.project.reflect.Model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@Entity
public class MindsetCards {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    private String front;

    @ElementCollection
    private Collection <String> back;

    /*TODO
    *
    * Make a @OneToMany relationship with the User and this
    * */


    /*TODO
     *
     * Add a cards to the populator
     * */



    public MindsetCards() {
    }

    public MindsetCards(User user, String front, Collection<String> back) {
        this.user = user;
        this.front = front;
        this.back = back;
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
}
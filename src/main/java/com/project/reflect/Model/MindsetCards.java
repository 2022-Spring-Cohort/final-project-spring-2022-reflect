package com.project.reflect.Model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@Entity
public class MindsetCards {
    @Id
    @GeneratedValue
    private String front;
    private Collection<String> back;

    /*TODO
    *
    * Make a @OneToMany relationship with the User and this
    * */


    /*TODO
     *
     * Add a cards to the populator
     * */
    @ManyToOne
    private User user;


    public MindsetCards() {
    }

    public MindsetCards(String front, Set<String> back) {
        this.front = front;
        this.back = back;
    }

    public String getFront() {
        return front;
    }

    public Iterable <String> getBack() {
        return back;
    }
}
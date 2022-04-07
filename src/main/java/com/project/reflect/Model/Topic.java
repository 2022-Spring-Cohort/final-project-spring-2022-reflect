package com.project.reflect.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Topic {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany(mappedBy = "topic")
   private Collection<Article> articles;

    public Topic(String name){
        this.name = name;

    }

    public Topic(){

    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Collection<Article> getArticles(){
        return articles;
    }
}

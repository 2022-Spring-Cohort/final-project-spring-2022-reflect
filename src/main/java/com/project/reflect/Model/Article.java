package com.project.reflect.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    private String author;
    private String content;
    private String title;
    private String picture;
    private String link;

    @ManyToOne
   private Topic topic;


    public Article(){

    }

    public Article(String title, String author, String picture, String content, String link, Topic topic){
        this.author = author;
        this.title = title;
        this.content = content;
        this.picture = picture;
        this.link = link;
        this.topic = topic;


    }

    public Long getId() {
        return id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

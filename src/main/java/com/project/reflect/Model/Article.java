package com.project.reflect.Model;

import javax.persistence.Embeddable;

@Embeddable
public class Article {
    private String author;
    private String content;
    private String title;

    public Article(){

    }

    public Article(String author, String content, String title){
        this.author = author;
        this.content = content;
        this.title = title;
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

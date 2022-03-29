package com.project.reflect.Model;

import javax.persistence.Embeddable;

@Embeddable
public class Comments {

    private String author;
    private String review;
    private int rating;

    public Comments() {
    }

    public Comments(String author, String review, int rating) {
        this.author = author;
        this.review = review;
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

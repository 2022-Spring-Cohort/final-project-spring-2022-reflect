package com.project.reflect.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class MindsetCardsWhy extends MindsetCards {




    public MindsetCardsWhy() {
    }

    public MindsetCardsWhy(User user, String photo, String front, String back) {
        super(user, photo, front, back);
    }


}

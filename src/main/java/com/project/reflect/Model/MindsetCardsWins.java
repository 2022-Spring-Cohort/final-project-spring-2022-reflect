package com.project.reflect.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class MindsetCardsWins extends MindsetCards{



    public MindsetCardsWins() {
    }

    public MindsetCardsWins(User user, String photo, String front, String... back) {
        super(user, photo, front, back);
    }

}

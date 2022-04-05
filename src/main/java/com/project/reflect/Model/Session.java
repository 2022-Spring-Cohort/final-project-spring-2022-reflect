package com.project.reflect.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Session {
    @Id
    @GeneratedValue
    private Long id;
    private String date;


  /*  TODO
   difference between start and end
   Local DateTime

  private String timeStart;
  private Date timeEnd;


*/



    @ManyToOne
    private User user;

    @ElementCollection
    private Collection<Comments> comments;

    public Session() {
    }

    public Session(Long id, String date, String time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public  Collection<Comments> getComments(){
        return comments;
    }
}

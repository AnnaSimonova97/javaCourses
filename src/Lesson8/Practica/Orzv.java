package Lesson8.Practica;

import java.util.Date;

public class Orzv {
    private  String commentary;
    private int stars;
    private Date date;
    private User user;  // один отзыв имеет одного пользователя

    public Orzv() {
    }

    public Orzv(int stars, Date date) {
        this.stars = stars;
        this.date = date;
    }

    public Orzv(String commentary, int stars, Date date, User user) {
        this.commentary = commentary;
        this.stars = stars;
        this.date = date;
        this.user = user;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

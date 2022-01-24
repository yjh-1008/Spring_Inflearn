package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Movie extends Item{
    private String director;
    private String author;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

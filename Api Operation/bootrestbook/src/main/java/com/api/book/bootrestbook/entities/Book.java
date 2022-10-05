package com.api.book.bootrestbook.entities;

import javax.annotation.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Indexed;

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(stratergy = GenerationType.AUTO)
    @Column(name="book_id")
    private int id;
    private String Title;
    private String Author;
    public Book() {
    }
    public Book(int id, String Title, String Author) {
        this.id = id;
        this.Title = Title;
        this.Author = Author;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", Title=" + Title + ", Author=" + Author + "]";
    }





    
    
    



    
}

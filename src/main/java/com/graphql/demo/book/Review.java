/**
 * 
 */
package com.graphql.demo.book;

import jakarta.persistence.*;

/**
 * @author Gbenga
 *
 */
@Entity
public class Review {

    @Id
    @GeneratedValue
    private Integer id;
    
    private String title;
    
    private String comment;
    
    @ManyToOne
    private Book book;

    public Review() {
    }

    public Review(String title, String comment) {
        this.title = title;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}

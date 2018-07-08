package com.hanchate.bookstore.model;

import javax.persistence.*;
import java.util.Date;
import java.util.logging.Level;

@Entity
public class Book {

@Id
@GeneratedValue
private Long id;
    @Column(length = 100)
private String title;

private String isbn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Column( name="publication_Date")
    @Temporal(TemporalType.DATE)
    private Date publicationDate;

}




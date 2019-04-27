package com.sda.library.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;
    private String name;

    @ManyToOne
    private Category category;

    @ManyToMany
    private Set<Author> authors;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

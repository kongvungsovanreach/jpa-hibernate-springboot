package com.kshrd.jpahibernate.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "article_entity")
@Table(name = "tb_articles")
public class Article implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    String title;
    String description;
    String author;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cate_id", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    Category category;

    public Article() {
    }

    public Article(int id, String title, String description, String author, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
//                ", category=" + category +
                '}';
    }
}


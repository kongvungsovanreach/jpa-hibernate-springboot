package com.kshrd.jpahibernate.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "category_entity")
@Table(name = "tb_category")
public class Category implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    String title;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)

    @JsonIgnore
    List<Article> articles;

    public Category() {
    }

    public Category(String title, List<Article> articles) {
        this.title = title;
        this.articles = articles;
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

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", title='" + title + '\'' +
//                ", articles=" + articles +
                '}';
    }
}

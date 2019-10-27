package com.kshrd.jpahibernate.controller;

import com.kshrd.jpahibernate.repository.ArticleRepository;
import com.kshrd.jpahibernate.repository.CategoryRepository;
import com.kshrd.jpahibernate.repository.model.Article;
import com.kshrd.jpahibernate.repository.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private EntityManager entityManager;

    @GetMapping("/")
    public List<Article> index(){
        return articleRepository.findAll();
    }

    @PostMapping("/article")
    public Article insert(){
        Article article = new Article();
        article.setTitle("Love is in the air");
        article.setDescription("This is the description");
        article.setAuthor("this is the author");
//        System.out.println(categoryRepository.getOne(1));
//        Category category =new Category();
//        category.setTitle("romantic");
//        categoryRepository.save(category);
        article.setCategory(categoryRepository.getOne(1));

        articleRepository.save(article);
        return article;
    }





    @PostMapping("/category")
    public String insertCategory(){
        Category category= new Category();
        category.setTitle("Funny");
        categoryRepository.save(category);
        categoryRepository.flush();
        return "The category is inserted successfully!";
    }

    @DeleteMapping("/category/{id}")
    public String insertCategory(@PathVariable int id){
        Category category = categoryRepository.getOne(id);
        categoryRepository.delete(category);
        entityManager.detach();
        return "The category is deleted successfully!";
    }


}

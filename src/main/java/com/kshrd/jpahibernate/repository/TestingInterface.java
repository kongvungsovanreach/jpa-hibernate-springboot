package com.kshrd.jpahibernate.repository;

import com.kshrd.jpahibernate.repository.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestingInterface  extends JpaRepository<Article, Integer> {
    @Query(nativeQuery = true,
            value = "select * from tb_articles where id = 5")
    List<Article> findAllArticles();
}

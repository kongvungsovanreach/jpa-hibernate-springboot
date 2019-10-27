package com.kshrd.jpahibernate.repository;

import com.kshrd.jpahibernate.repository.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}

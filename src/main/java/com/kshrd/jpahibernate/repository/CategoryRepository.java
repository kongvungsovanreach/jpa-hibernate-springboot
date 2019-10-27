package com.kshrd.jpahibernate.repository;

import com.kshrd.jpahibernate.repository.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

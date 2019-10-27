package com.kshrd.jpahibernate;

import com.kshrd.jpahibernate.repository.TestingInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan("com.kshrd.jpahibernate.repository")
//@EnableJpaRepositories (basePackageClasses = {TestingInterface.class})
public class JpahibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpahibernateApplication.class, args);
    }

}

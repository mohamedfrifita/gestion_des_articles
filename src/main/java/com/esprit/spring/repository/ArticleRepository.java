package com.esprit.spring.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.esprit.spring.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {
	
}

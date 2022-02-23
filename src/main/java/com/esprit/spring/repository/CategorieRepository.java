package com.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.esprit.spring.entity.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Integer> {
	
	
}

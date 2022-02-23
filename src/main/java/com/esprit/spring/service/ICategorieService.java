package com.esprit.spring.service;

import java.util.List;

import com.esprit.spring.entity.Categorie;

public interface ICategorieService {
	
	public void ajouterCategorie(Categorie cat);
	public List<Categorie> getAllCategories();
	public List<String> getAllArticleNamesByCategorie(int idmacategorie);

}

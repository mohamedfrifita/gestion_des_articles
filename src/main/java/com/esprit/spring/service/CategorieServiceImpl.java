package com.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.spring.entity.Article;
import com.esprit.spring.entity.Categorie;
import com.esprit.spring.repository.CategorieRepository;

@Service
public class CategorieServiceImpl implements ICategorieService {
	
	@Autowired
	CategorieRepository categorieRepository;
	
	private static final Logger L = LogManager.getLogger(CategorieServiceImpl.class);

	@Override
	public void ajouterCategorie(Categorie cat) {
		categorieRepository.save(cat);
		
	}

	@Override
	public List<Categorie> getAllCategories() {
		
		return (List<Categorie>) categorieRepository.findAll();
	}

	@Override
	public List<String> getAllArticleNamesByCategorie(int idmacategorie) {
		Categorie categorie=categorieRepository.findById(idmacategorie).get();
		List<Article> art=(List<Article>)categorie.getArticles();
		List<String> names = new ArrayList<>();
		for(Article a:art) {
			names.add(a.getNom());
		}
		return names;
	}

}

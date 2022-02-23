package com.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.spring.entity.Article;
import com.esprit.spring.entity.Categorie;
import com.esprit.spring.repository.ArticleRepository;
import com.esprit.spring.repository.CategorieRepository;

@Service
public class ArticleServiceImpl implements IArticleService {
	
	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	CategorieRepository categorieRepository;
	
	
	private static final Logger L = LogManager.getLogger(ArticleServiceImpl.class);

	@Override
	public void ajouterArticle(Article article) {
		articleRepository.save(article);
		
	}

	@Override
	public void affecteArtCat(int idcat, int idart) {
		Categorie categorie=categorieRepository.findById(idcat).get();
		Article article=articleRepository.findById(idart).get();
		article.setCategorie(categorie);
		articleRepository.save(article);
		
	}

}

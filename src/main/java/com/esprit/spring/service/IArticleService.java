package com.esprit.spring.service;



import com.esprit.spring.entity.Article;

public interface IArticleService {
	public void ajouterArticle(Article article);
	public void affecteArtCat(int idcat,int idart);


}

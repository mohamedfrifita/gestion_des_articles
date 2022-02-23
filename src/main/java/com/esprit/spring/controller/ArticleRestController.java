package com.esprit.spring.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.spring.entity.Article;

import com.esprit.spring.service.IArticleService;

@RestController
public class ArticleRestController {
	@Autowired
	IArticleService articleService;
	
	
	// http://localhost:8081/SpringMVC/servlet/add-article
	
		@PostMapping("/add-article")
		@ResponseBody
		public void ajouterArticle(@RequestBody Article article) {
			articleService.ajouterArticle(article);
		}
		
		
		// http://localhost:8081/SpringMVC/servlet/affecterArtCat
		@PostMapping("/affecterArtCat")
		@ResponseBody
		public void affecterArtCat(@RequestParam("idart")int idart,@RequestParam("idcat") int idcat) {
			articleService.affecteArtCat((int) idcat, (int) idart);
		}
		
		/*
		// http://localhost:8081/SpringMVC/servlet/getAllArticleNamesByCategorie/{idmacategorie}
		@GetMapping("/getAllArticleNamesByCategorie/{idmacategorie}")
		@ResponseBody
		public  List<String> getAllArticleNamesByCategorie(@PathVariable("idmacategorie")int idmacategorie) {
			return  articleService.getAllArticleNamesByCategorie((int)idmacategorie);
		}
		
*/
}

package com.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.esprit.spring.entity.Categorie;

import com.esprit.spring.service.ICategorieService;

@RestController
public class CategorieRestController {
	@Autowired
	ICategorieService categorieService;
	
	// http://localhost:8081/SpringMVC/servlet/add-categorie
	
		@PostMapping("/add-categorie")
		@ResponseBody
		public void ajouterCategorie(@RequestBody Categorie categorie) {
			categorieService.ajouterCategorie(categorie);
		}
		
		// http://localhost:8081/SpringMVC/servlet/getAllCategories
		@GetMapping("/getAllCategories")
		@ResponseBody
		public List<Categorie> getAllCategries() {
			return categorieService.getAllCategories();
		}
		
		// http://localhost:8081/SpringMVC/servlet/affecterArticleACategorie/{idmacategorie}
				@GetMapping("/affecterArticleACategorie/{idmacategorie}")
				@ResponseBody
				public List<String> getAllArticleNamesByCategorie(@PathVariable ("idmacategorie")int idmacategorie ){
					return categorieService.getAllArticleNamesByCategorie(idmacategorie);
					
					
				}

}

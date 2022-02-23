package com.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.spring.entity.Commande;
import com.esprit.spring.service.ICommandeService;

@RestController
public class CommandeRestController {
	@Autowired
	ICommandeService commandeService;
	
	// http://localhost:8081/SpringMVC/servlet/add-commande
	
	@PostMapping("/add-commande")
	@ResponseBody
	public void ajouterCommande(@RequestBody Commande commande) {
		commandeService.ajouterCommande(commande);
	}
		
	
	
	// http://localhost:8081/SpringMVC/servlet/affecterArtCmd
			@PostMapping("/affecterArtCmd")
			@ResponseBody
			public void affecterArtCmd(@RequestParam("idart")int idart,@RequestParam("idcmd") int idcmd) {
				commandeService.affecterArtCmd((int) idcmd, (int) idart);
			}

}

package com.esprit.spring.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.spring.entity.Article;
import com.esprit.spring.entity.Commande;
import com.esprit.spring.repository.ArticleRepository;
import com.esprit.spring.repository.CommandeRepository;

@Service
public class CommandeServiceImpl implements ICommandeService {
	
	@Autowired
	CommandeRepository commandeRepository;
	@Autowired
	ArticleRepository articleRepository;
	private static final Logger L = LogManager.getLogger(CommandeServiceImpl.class);

	@Override
	public void ajouterCommande(Commande c) {
		commandeRepository.save(c);
		
	}

	@Override
	public void affecterArtCmd(int idcmd, int idart) {
		Commande commande=commandeRepository.findById(idcmd).get();
		Article article=articleRepository.findById(idart).get();
		
			article.setCommande(commande);
			articleRepository.save(article);
		
		
	}

}

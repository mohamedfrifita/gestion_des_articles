package com.esprit.spring.service;

import com.esprit.spring.entity.Commande;

public interface ICommandeService {
	public void ajouterCommande(Commande c);
	public void affecterArtCmd(int idcmd,int idart);

}

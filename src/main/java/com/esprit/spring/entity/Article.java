package com.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="article")
public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4409797012321053779L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idart;
	private String nom;
	private int prix;
	private String image;
	@JsonIgnore
	@ManyToOne
	 Categorie categorie;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	Commande commande;
	
	
	
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public int getIdart() {
		return idart;
	}
	public void setIdart(int idart) {
		this.idart = idart;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Article(int idart, String nom, int prix, String image) {
		super();
		this.idart = idart;
		this.nom = nom;
		this.prix = prix;
		this.image = image;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Article [idart=" + idart + ", nom=" + nom + ", prix=" + prix + ", image=" + image + "]";
	}
	
	
	

}

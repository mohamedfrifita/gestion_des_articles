package com.esprit.spring.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="categorie")
public class Categorie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7700817695047559344L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcat;
	private String nomcat;
	@JsonIgnore
	@OneToMany(mappedBy="categorie",cascade = CascadeType.ALL)
	private List<Article> articles=new ArrayList<>();
	
	
	
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	public int getIdcat() {
		return idcat;
	}
	public void setIdcat(int idcat) {
		this.idcat = idcat;
	}
	public String getNomcat() {
		return nomcat;
	}
	public void setNomcat(String nomcat) {
		this.nomcat = nomcat;
	}
	public Categorie(int idcat, String nomcat) {
		super();
		this.idcat = idcat;
		this.nomcat = nomcat;
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Categorie [idcat=" + idcat + ", nomcat=" + nomcat + "]";
	}
	
	
	

}

package com.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="commande")
public class Commande implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3208552947939092982L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcmd;
	@Temporal(TemporalType.DATE)
	private Date dateLivrraison;
	@Enumerated(EnumType.STRING)
	Status status;
	
	
	
	
	public int getIdcmd() {
		return idcmd;
	}
	public void setIdcmd(int idcmd) {
		this.idcmd = idcmd;
	}
	public Date getDateLivrraison() {
		return dateLivrraison;
	}
	public void setDateLivrraison(Date dateLivrraison) {
		this.dateLivrraison = dateLivrraison;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Commande(int idcmd, Date dateLivrraison, Status status) {
		super();
		this.idcmd = idcmd;
		this.dateLivrraison = dateLivrraison;
		this.status = status;
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Commande [idcmd=" + idcmd + ", dateLivrraison=" + dateLivrraison + ", status=" + status + "]";
	}
	
	

}

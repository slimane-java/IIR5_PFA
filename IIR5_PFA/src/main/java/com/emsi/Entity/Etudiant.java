package com.emsi.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity

public class Etudiant extends User implements Serializable{
	
	private String NiveauScolaire;
	private String Filier;
	
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(int idUser, String nom, String prenom, Date dateNaissance, Date dateIntegrer, String email,
			String tel,String niveauScolaire,String filier) {
		super( nom, prenom, dateNaissance, dateIntegrer, email, tel);
		
		this.NiveauScolaire=niveauScolaire;
		this.Filier=filier;
		// TODO Auto-generated constructor stub
	}

	public String getNiveauScolaire() {
		return NiveauScolaire;
	}

	public void setNiveauScolaire(String niveauScolaire) {
		NiveauScolaire = niveauScolaire;
	}
	
	

}

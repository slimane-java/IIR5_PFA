package com.emsi.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Chapiter implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdChapiter;
	private String Nom;
	private String Description;
	
	@ManyToOne
	private Cours cours;
	
	
	
	
	public Chapiter( String nom, String description) {
		super();
		
		Nom = nom;
		Description = description;
	}
	public Chapiter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@OneToMany(mappedBy = "chapiter")
	
	public int getIdConcept() {
		return IdChapiter;
	}

	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	

}

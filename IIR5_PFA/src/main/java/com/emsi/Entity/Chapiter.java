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
	private String NomChapiter;
	private String Description;
	
	@ManyToOne
	private Cours cours;
	
	
	
	
	public Chapiter( String nomChapiter, String description) {
		super();
		
		NomChapiter = nomChapiter;
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
		return NomChapiter;
	}
	public void setNom(String nom) {
		NomChapiter = nom;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	

}

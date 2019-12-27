package com.emsi.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ConceptPedagogique implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdCP;
	private String Nom;
	private String Url;
	private String Description;
	private Date dateCreation;
	private int  Dure ;
	@ManyToOne
	private Chapiter chapiter;
	public ConceptPedagogique(String nom, String url, String description) {
		super();
		
		Nom = nom;
		Url = url;
		Description = description;
	}
	public ConceptPedagogique() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	

}

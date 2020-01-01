package com.emsi.Entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Fichier extends ConceptPedagogique{

	public Fichier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fichier(String nomConcept, String url, String description, Date dateCreation, int dure) {
		super(nomConcept, url, description, dateCreation, dure);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Fichier [toString()=" + super.toString() + "]";
	}

	
	
	
	
}

package com.emsi.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Tp extends ConceptPedagogique{

	public Tp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tp(String nomConcept, String url, String description, Date dateCreation, int dure) {
		super(nomConcept, url, description, dateCreation, dure);
		// TODO Auto-generated constructor stub
	}
	
	
	

}

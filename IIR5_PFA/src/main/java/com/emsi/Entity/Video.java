package com.emsi.Entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Video extends ConceptPedagogique{

	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Video(String nomConcept, String url, String description, Date dateCreation, int dure) {
		super(nomConcept, url, description, dateCreation, dure);
		// TODO Auto-generated constructor stub
	}
	
	

}

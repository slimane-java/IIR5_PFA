package com.emsi.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ConceptPedagogique implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdCP;
	private String NomConcept;
	private String Url;
	private String Description;
	private Date DateCreation;
	private int  Dure ;
	
	@ManyToOne
	private Chapiter chapiters;
	
	
	
	public ConceptPedagogique(String nomConcept, String url, String description, Date dateCreation, int dure) {
		super();
	
		NomConcept = nomConcept;
		Url = url;
		Description = description;
		DateCreation = dateCreation;
		Dure = dure;
		
	}
	public ConceptPedagogique() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getIdCP() {
		return IdCP;
	}
	
	public void setIdCP(int idCP) {
		IdCP = idCP;
	}
	public String getNomConcept() {
		return NomConcept;
	}
	public void setNomConcept(String nomConcept) {
		NomConcept = nomConcept;
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
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	public int getDure() {
		return Dure;
	}
	public void setDure(int dure) {
		Dure = dure;
	}
	public Chapiter getChapiters() {
		return chapiters;
	}
	public void setChapiters(Chapiter chapiters) {
		this.chapiters = chapiters;
	}
	@Override
	public String toString() {
		return "ConceptPedagogique [IdCP=" + IdCP + ", NomConcept=" + NomConcept + ", Url=" + Url + ", Description="
				+ Description + ", DateCreation=" + DateCreation + ", Dure=" + Dure + ", chapiters=" + chapiters + "]";
	}
	
	
	
	
	
}

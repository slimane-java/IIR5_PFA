package com.emsi.Entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Cours implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int IdCour;
	private String NomCour;
	private int NbHeure;
	private String Description;
	
	@OneToMany(mappedBy = "cours")
	private Set<Chapiter> chapiter;
	
	@ManyToMany()
	private Set<User>users=new HashSet<User>();
	
	
	
	public Cours(String nomCour, int nbHeure, String description) {
		super();
		
		NomCour = nomCour;
		NbHeure = nbHeure;
		Description = description;
	}
	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public String getNomCour() {
		return NomCour;
	}
	public void setNomCour(String nomCour) {
		NomCour = nomCour;
	}
	public int getNbHeure() {
		return NbHeure;
	}
	public void setNbHeure(int nbHeure) {
		NbHeure = nbHeure;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	

}

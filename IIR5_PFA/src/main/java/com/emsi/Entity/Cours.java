package com.emsi.Entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdCour;
	private String NomCour;
	private int NbHeure;
	private String Description;
	
	
	
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
	
	@OneToMany(mappedBy = "cours")
	
	
	
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
	public int getIdCour() {
		return IdCour;
	}
	
	public void setIdCour(int idCour) {
		IdCour = idCour;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	

}

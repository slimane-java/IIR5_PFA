package com.emsi.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int    IdUser;
	private String Nom;
	private String Prenom;
	private Date   DateNaissance;
	private Date   DateIntegrer;
	private String Email;
	private String Tel;
	private String Login;
	private String Passwored;
	
	@ManyToMany
	private Set<Cours>cours=new HashSet<Cours>();
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User( String nom, String prenom, Date dateNaissance, Date dateIntegrer, String email,
			String tel,String login,String passwored) {
		super();
		
		Nom = nom;
		Prenom = prenom;
		DateNaissance = dateNaissance;
		DateIntegrer = dateIntegrer;
		Email = email;
		Tel = tel;
		Login=login;
		Passwored=passwored;
	}


	public String getLogin() {
		return Login;
	}


	public void setLogin(String login) {
		Login = login;
	}


	public String getPasswored() {
		return Passwored;
	}


	public void setPasswored(String passwored) {
		Passwored = passwored;
	}


	public Set<Cours> getCours() {
		return cours;
	}


	public void setCours(Set<Cours> cours) {
		this.cours = cours;
	}


	public int getIdUser() {
		return IdUser;
	}


	public void setIdUser(int idUser) {
		IdUser = idUser;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public String getPrenom() {
		return Prenom;
	}


	public void setPrenom(String prenom) {
		Prenom = prenom;
	}


	public Date getDateNaissance() {
		return DateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}


	public Date getDateIntegrer() {
		return DateIntegrer;
	}


	public void setDateIntegrer(Date dateIntegrer) {
		DateIntegrer = dateIntegrer;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getTel() {
		return Tel;
	}


	public void setTel(String tel) {
		Tel = tel;
	}


	@Override
	public String toString() {
		return "User [IdUser=" + IdUser + ", Nom=" + Nom + ", Prenom=" + Prenom + ", DateNaissance=" + DateNaissance
				+ ", DateIntegrer=" + DateIntegrer + ", Email=" + Email + ", Tel=" + Tel + "]";
	}
	
	
	
	
	
	
}

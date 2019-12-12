package com.emsi.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Repondre {
	@Id
	private int IdRepondre;
	private String Repondre;
	private float Point;
	
	@ManyToOne
	private Question question;
	
	public Repondre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Repondre(int idRepondre, String repondre, float point) {
		super();
		IdRepondre = idRepondre;
		Repondre = repondre;
		Point = point;
	}
	public int getIdRepondre() {
		return IdRepondre;
	}
	public void setIdRepondre(int idRepondre) {
		IdRepondre = idRepondre;
	}
	public String getRepondre() {
		return Repondre;
	}
	public void setRepondre(String repondre) {
		Repondre = repondre;
	}
	public float getPoint() {
		return Point;
	}
	public void setPoint(float point) {
		Point = point;
	}
	
	

}

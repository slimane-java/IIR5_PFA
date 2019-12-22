package com.emsi.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	private int IdQuestion;
	private String Question;
	
	@ManyToOne
	private QSM qsm;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question( String question, QSM qsm) {
		super();
		
		Question = question;
		this.qsm = qsm;
	}
	

	@OneToMany(mappedBy = "question")

	public int getIdQuestion() {
		return IdQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		IdQuestion = idQuestion;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public QSM getQsm() {
		return qsm;
	}

	public void setQsm(QSM qsm) {
		this.qsm = qsm;
	}
	
	
	
	
	
	
}

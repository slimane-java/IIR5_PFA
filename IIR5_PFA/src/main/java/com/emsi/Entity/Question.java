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
	
	@OneToMany(mappedBy = "question")
	private Set<Repondre>repondre=new HashSet<Repondre>();
	
}

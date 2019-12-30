package com.emsi.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class QSM extends ConceptPedagogique{
    private String Type;

   

    public QSM(String nomConcept, String url, String description, Date dateCreation, int dure,String type) {
		super(nomConcept, url, description, dateCreation, dure);
		// TODO Auto-generated constructor stub
		this.Type=type;
	}


	public QSM() {
		super();
		// TODO Auto-generated constructor stub
	}
    

	@OneToMany(mappedBy = "qsm")
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}

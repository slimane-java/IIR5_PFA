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

    public QSM(String nom, String url, String description, String type) {
        super(nom, url, description);
        this.Type=type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}

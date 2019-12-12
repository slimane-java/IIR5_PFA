package com.emsi.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.Entity.Chapiter;
import com.emsi.Entity.Professeur;

public interface ProfesseurRepository extends JpaRepository<Professeur, Integer>{

}

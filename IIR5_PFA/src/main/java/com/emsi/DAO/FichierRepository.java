package com.emsi.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.Entity.Chapiter;
import com.emsi.Entity.Fichier;

public interface FichierRepository extends JpaRepository<Fichier, Integer>{

}

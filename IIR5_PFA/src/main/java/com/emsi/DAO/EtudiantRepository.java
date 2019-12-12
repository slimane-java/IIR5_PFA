package com.emsi.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.Entity.Chapiter;
import com.emsi.Entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{

}

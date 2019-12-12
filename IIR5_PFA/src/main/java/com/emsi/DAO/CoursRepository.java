package com.emsi.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.Entity.Chapiter;
import com.emsi.Entity.Cours;

public interface CoursRepository extends JpaRepository<Cours, Integer>{

}

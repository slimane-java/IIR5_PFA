package com.emsi.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emsi.Entity.Chapiter;
import com.emsi.Entity.Cours;

public interface CoursRepository extends JpaRepository<Cours, Integer>{

	
}

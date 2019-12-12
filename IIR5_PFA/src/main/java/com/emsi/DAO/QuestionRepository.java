package com.emsi.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.Entity.Chapiter;
import com.emsi.Entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

}

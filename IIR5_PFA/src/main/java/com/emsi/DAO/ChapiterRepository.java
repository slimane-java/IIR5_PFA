package com.emsi.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emsi.Entity.Chapiter;
import com.emsi.Entity.User;

public interface ChapiterRepository extends JpaRepository<Chapiter, Integer>{
	@Query(value = "SELECT u FROM Chapiter u"
			+ " where u.cours.IdCour=?1 ")
	List<Chapiter> GetChapiterByCours(int id);

}

package com.emsi.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emsi.Entity.Chapiter;
import com.emsi.Entity.ConceptPedagogique;

public interface ConceptPedagogiqueRepository extends JpaRepository<ConceptPedagogique, Integer>{
	
	@Query(value = "SELECT u FROM ConceptPedagogique u"
			+ " where u.chapiter.IdChapiter=?1 ")
	List<ConceptPedagogique> GetconceptByChapiter(int id);

}

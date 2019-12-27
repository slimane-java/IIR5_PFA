package com.emsi.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emsi.DAO.ChapiterRepository;
import com.emsi.DAO.ConceptPedagogiqueRepository;
import com.emsi.Entity.Chapiter;
import com.emsi.Entity.ConceptPedagogique;

@RestController
@CrossOrigin("*")
public class ConceptPedagogiqueRestService {

	

	@Autowired
	private ConceptPedagogiqueRepository conceptPedagogiqueRepository;
	
	
	

	@RequestMapping(value = "GetConceptByChapiter/{id}",method = RequestMethod.GET)
	public List<ConceptPedagogique> GetConceptByChapiter(@PathVariable int id)
	{
		return conceptPedagogiqueRepository.GetconceptByChapiter(id);
	}
	
	
}

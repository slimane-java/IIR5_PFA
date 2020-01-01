package com.emsi.Web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emsi.DAO.ChapiterRepository;
import com.emsi.DAO.ConceptPedagogiqueRepository;
import com.emsi.DAO.FichierRepository;
import com.emsi.DAO.TpRepository;
import com.emsi.DAO.VideoRepository;
import com.emsi.Entity.Chapiter;
import com.emsi.Entity.ConceptPedagogique;
import com.emsi.Entity.Etudiant;
import com.emsi.Entity.Fichier;
import com.emsi.Entity.Professeur;
import com.emsi.Entity.User;

@RestController
@CrossOrigin("*")
public class ConceptPedagogiqueRestService {

	

	
	@Autowired
	private ConceptPedagogiqueRepository conceptPedagogiqueRepository;


	
	
	
	@RequestMapping(value = "AddConcept",method = RequestMethod.POST)
	public ConceptPedagogique AddConcept(@RequestBody() ConceptPedagogique c )
	{
		return conceptPedagogiqueRepository.saveAndFlush(c);
	}
	
	@RequestMapping(value = "GetConceptByChapiter/{id}",method = RequestMethod.GET)
	public List<ConceptPedagogique> GetConceptByChapiter(@PathVariable int id)
	{
		return conceptPedagogiqueRepository.GetconceptByChapiter(id);
	}
	
	@RequestMapping(value = "GetConceptById/{id}",method = RequestMethod.GET)
	public Optional<ConceptPedagogique> GetConceptByID(@PathVariable int id)
	{
		return conceptPedagogiqueRepository.findById(id);
	}
	
	@RequestMapping(value = "Allconcept",method = RequestMethod.GET)
	public List<ConceptPedagogique> ListConcept()
	{
		return conceptPedagogiqueRepository.findAll();
	}
	
	
	
	
	
	
	
	
	
}

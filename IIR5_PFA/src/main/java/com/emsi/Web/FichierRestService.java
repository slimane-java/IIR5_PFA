package com.emsi.Web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emsi.DAO.FichierRepository;
import com.emsi.DAO.TpRepository;
import com.emsi.Entity.Fichier;
import com.emsi.Entity.Tp;

@RestController
@CrossOrigin("*")
public class FichierRestService {
	
	@Autowired
	private FichierRepository fichierRepository;
	
	
	@RequestMapping(value = "AddFichier",method = RequestMethod.POST)
	public Fichier AddFichier(@RequestBody() Fichier c )
	{
		return fichierRepository.save(c);
	}
	
	
	
	@RequestMapping(value = "DeleteFichier/{id}",method = RequestMethod.DELETE)
	public boolean DeleteFichier(@PathVariable int id )
	{
		fichierRepository.deleteById(id);
	return true;
		
	}
	
	@RequestMapping(value = "AllFichier",method = RequestMethod.GET)
	public List<Fichier> ListFichier()
	{
		return fichierRepository.findAll();
	}
	
	
	@RequestMapping(value = "Getfichier/{id}",method = RequestMethod.GET)
	public Optional<Fichier> GetFichier(@PathVariable int id)
	{
		return fichierRepository.findById(id);
	}

}

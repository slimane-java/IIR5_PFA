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

import com.emsi.DAO.EtudiantRepository;
import com.emsi.DAO.ProfesseurRepository;
import com.emsi.DAO.UserRepository;
import com.emsi.Entity.Etudiant;
import com.emsi.Entity.Professeur;
import com.emsi.Entity.User;

@RestController
@CrossOrigin("*")
public class ProfesseurRestService {
	

	@Autowired
	private ProfesseurRepository professeurRepository;
	
	@RequestMapping(value = "AddProf",method=RequestMethod.POST )
	public User AddProfesseur(@RequestBody Professeur u)
	{
			
				return professeurRepository.save(u);
				
				
		
	}
	
	@RequestMapping(value = "UpdateProf",method=RequestMethod.POST )
	public User UpdateProfesseur(@RequestBody Professeur u)
	{
		return professeurRepository.save(u);
		
	}
	
	@RequestMapping(value = "deleteProf/{id}",method=RequestMethod.DELETE )
	public void DeletProfesseur(@PathVariable  int id)
	{
		professeurRepository.deleteById(id);
		
	}
	
	

	@RequestMapping(value = "GetProf/{id}",method = RequestMethod.GET)
	public Optional<Professeur> GetProfesseur(@PathVariable int id)
	{
		return professeurRepository.findById(id);
	}
		
	@RequestMapping(value = "AllProf",method=RequestMethod.GET )
	public List<Professeur> ListProfesseur()
	{
		return professeurRepository.findAll();
		
	}

}

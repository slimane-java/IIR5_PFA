package com.emsi.Web;

import java.util.List;

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
public class EtudiantRestService {
	

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@RequestMapping(value = "AddEtud",method=RequestMethod.POST )
	public Etudiant AddEtudiant(@RequestBody Etudiant u)
	{
			
				return etudiantRepository.save(u);
				
				
		
	}
	
	@RequestMapping(value = "UpdateEtud",method=RequestMethod.POST )
	public User UpdateEtudiant(@RequestBody Etudiant u)
	{
		return etudiantRepository.save(u);
		
	}
	
	@RequestMapping(value = "/deleteEtud/{id}",method=RequestMethod.DELETE )
	public String DeletEtudiant(@PathVariable Integer id)
	{
		etudiantRepository.deleteById(id);
		return "bien Delete";
		
	}
	
	

	
		
	@RequestMapping(value = "AllEtud",method=RequestMethod.GET )
	public List<Etudiant> ListEtudiant()
	{
		return etudiantRepository.findAll();
		
	}

}

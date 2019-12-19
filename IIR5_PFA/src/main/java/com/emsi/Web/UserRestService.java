package com.emsi.Web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class UserRestService {
	

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private ProfesseurRepository professeurRepository;
	
	
	@RequestMapping(value = "Login/{login}/{passwored}",method=RequestMethod.GET )
	public List<String>   Conextion(@PathVariable String login,@PathVariable String passwored)
	{
		List<String> map=new ArrayList<String>();
		   	
		Optional<User> u=userRepository.recherche(login,passwored);
		
		List<String>ls =new ArrayList<String>();
		
		if(u.isPresent()) {
		
		if(etudiantRepository.findById(u.get().getIdUser()).isPresent())
		{
			
		Optional<Etudiant>e=etudiantRepository.findById(u.get().getIdUser());
		
		map.add("etudiantEspace");
		map.add(""+e.get().getIdUser());
			
		}
	 
		
		if(professeurRepository.findById(u.get().getIdUser()).isPresent()) 
		{
			Optional<Professeur>p=professeurRepository.findById(u.get().getIdUser());
			
			map.add("professeurEspace");
			map.add(""+p.get().getIdUser());
			
				
				
				
			}

		
		
		
		}
		
		 return map; 
		
				
				
		
	}
	

}


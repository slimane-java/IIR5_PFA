package com.emsi.Web;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emsi.DAO.CoursRepository;
import com.emsi.Entity.Cours;

@RestController
@CrossOrigin("*")
public class CoursRestService {
	
	@Autowired
	private CoursRepository coursRepository;
	
	
	@RequestMapping(value = "AddCours",method = RequestMethod.POST)
	public Cours AddCours(@RequestBody() Cours c )
	{
		return coursRepository.saveAndFlush(c);
	}
	
	@RequestMapping(value = "UpdateCours",method = RequestMethod.POST)
	public Cours UpdateCours(@RequestBody() Cours c)
	{
		return coursRepository.save(c);
	}
	
	@RequestMapping(value = "DeleteCours/{id}",method = RequestMethod.DELETE)
	public boolean DeleteCours(@PathVariable int id )
	{
		coursRepository.deleteById(id);
		return true;
		
	}
	
	@RequestMapping(value = "AllCours",method = RequestMethod.GET)
	public List<Cours> ListCours()
	{
		return coursRepository.findAll();
	}
	
	
	@RequestMapping(value = "Getcours/{id}",method = RequestMethod.GET)
	public Optional<Cours> GetCours(@PathVariable int id)
	{
		return coursRepository.findById(id);
	}
	
}

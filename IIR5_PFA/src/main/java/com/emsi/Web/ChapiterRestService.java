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

import com.emsi.DAO.ChapiterRepository;
import com.emsi.DAO.CoursRepository;
import com.emsi.Entity.Chapiter;
import com.emsi.Entity.Cours;
import com.emsi.Entity.User;

@RestController
@CrossOrigin("*")
public class ChapiterRestService {

	
	
	
	@Autowired
	private ChapiterRepository chapiterRepository;
	
	
	@RequestMapping(value = "AddChapiter",method = RequestMethod.POST)
	public Chapiter AddCours(@RequestBody() Chapiter c )
	{
		return chapiterRepository.saveAndFlush(c);
	}
	
	@RequestMapping(value = "DeleteChapiter/{id}",method = RequestMethod.DELETE)
	public boolean DeleteChapiter(@PathVariable int id )
	{
		chapiterRepository.deleteById(id);
		return true;
	}
	
	@RequestMapping(value = "AllChapiter",method = RequestMethod.GET)
	public List<Chapiter> ListChapiter()
	{
		return chapiterRepository.findAll();
	}
	
	@RequestMapping(value = "GetChapiterByCours/{id}",method = RequestMethod.GET)
	public List<Chapiter> GetChapiterByCours(@PathVariable int id)
	{
		return chapiterRepository.GetChapiterByCours(id);
	}
	
}

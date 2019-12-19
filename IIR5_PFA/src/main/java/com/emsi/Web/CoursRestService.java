package com.emsi.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
		return coursRepository.save(c);
	}
	
	public Cours UpdateCours()
	{
		return null;
	}
	
	public Cours DeleteCours()
	{
		return null;
	}
	
	public List<Cours> ListCours()
	{
		return coursRepository.findAll();
	}

}

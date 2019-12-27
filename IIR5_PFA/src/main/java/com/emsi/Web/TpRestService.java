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

import com.emsi.DAO.CoursRepository;
import com.emsi.DAO.TpRepository;
import com.emsi.Entity.Cours;
import com.emsi.Entity.Tp;

@RestController
@CrossOrigin("*")
public class TpRestService {
	
	@Autowired
	private TpRepository tpRepository;
	
	
	@RequestMapping(value = "AddTp",method = RequestMethod.POST)
	public Tp AddTp(@RequestBody() Tp c )
	{
		return tpRepository.save(c);
	}
	
	
	
	@RequestMapping(value = "DeleteTp/{id}",method = RequestMethod.DELETE)
	public boolean DeleteTp(@PathVariable int id )
	{
		tpRepository.deleteById(id);
	return true;
		
	}
	
	@RequestMapping(value = "AllTp",method = RequestMethod.GET)
	public List<Tp> ListCours()
	{
		return tpRepository.findAll();
	}
	
	
	@RequestMapping(value = "GetTp/{id}",method = RequestMethod.GET)
	public Optional<Tp> GetTp(@PathVariable int id)
	{
		return tpRepository.findById(id);
	}

}

package com.emsi.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.emsi.DAO.QSMRepository;

import com.emsi.Entity.QSM;


@RestController
@CrossOrigin("*")
public class QSMRestService {
	
	@Autowired
	private QSMRepository qSMRepository;
	
	
	@RequestMapping(value = "AddQsm",method = RequestMethod.POST)
	public QSM AddCours(@RequestBody() QSM c )
	{
		return qSMRepository.save(c);
	}
	
	@RequestMapping(value = "DeleteQsm/{id}",method = RequestMethod.DELETE)
	public List<QSM> DeleteChapiter(@PathVariable int id )
	{
		qSMRepository.deleteById(id);
		return qSMRepository.findAll();
	}
	
	@RequestMapping(value = "AllQsm",method = RequestMethod.GET)
	public List<QSM> ListChapiter()
	{
		return qSMRepository.findAll();
	}
	
	
	

}

package com.emsi.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emsi.DAO.UserRepository;
import com.emsi.Entity.User;

@RestController
@CrossOrigin("*")
public class UserRestService {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "AddUser",method=RequestMethod.GET )
	public User AddUser(@RequestBody User u)
	{
			
				return userRepository.save(u);
				
				
		
	}
	
	@RequestMapping(value = "Update",method=RequestMethod.POST )
	public User UpdateUser(@RequestBody User u)
	{
		return userRepository.save(u);
		
	}
	
	@RequestMapping(value = "delete",method=RequestMethod.DELETE )
	public void DeletUser(@RequestBody User u)
	{
		 userRepository.delete(u);
		
	}
	
	@RequestMapping(value = "",method=RequestMethod.GET )
	public String Home()
	{
		
		return "is Work";
	}

	
	@RequestMapping(value = "All",method=RequestMethod.GET )
	public List<User> UpdateUser()
	{
		return userRepository.findAll();
		
	}

}

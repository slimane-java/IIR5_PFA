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
import com.emsi.DAO.VideoRepository;
import com.emsi.Entity.Fichier;
import com.emsi.Entity.Video;

@RestController
@CrossOrigin("*")
public class VideoRestService {

	@Autowired
	private VideoRepository videoRepository;
	
	
	@RequestMapping(value = "Addvideo",method = RequestMethod.POST)
	public Video AddVideo(@RequestBody() Video c )
	{
		return videoRepository.save(c);
	}
	
	
	
	@RequestMapping(value = "DeleteVideo/{id}",method = RequestMethod.DELETE)
	public boolean DeleteVideo(@PathVariable int id )
	{
		videoRepository.deleteById(id);
	return true;
		
	}
	
	@RequestMapping(value = "AllVideo",method = RequestMethod.GET)
	public List<Video> ListVideo()
	{
		return videoRepository.findAll();
	}
	
	
	@RequestMapping(value = "GetVideo/{id}",method = RequestMethod.GET)
	public Optional<Video> Getvideo(@PathVariable int id)
	{
		return videoRepository.findById(id);
	}

}

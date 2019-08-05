package com.example.Controller;

import java.util.List;

//import com.example.Repository.ParticipantRepository;
import com.example.Service.ParticipantService;
import com.example.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/participant")
public class ParticipantController{
	
	
	  @Autowired 
	  ParticipantService participantService;
	
	  
	@RequestMapping(path = "/all" , method = RequestMethod.GET ,produces = "application/json")
	public List<ParticipantEntity> getAllParticipant() {
		List<ParticipantEntity> participantList = participantService.getAllParticipants();
		
		return participantList;
	}

}

package com.example.demo.Controller;

import java.util.List;

//import com.example.Repository.ParticipantRepository;
import com.example.demo.Service.ParticipantService;
import com.example.demo.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ParticipantController{
	
	
	  @Autowired
	  ParticipantService participantService;
	
	  
	@RequestMapping(path = "/participant")
	public List<ParticipantEntity> getAllParticipant() {
		List<ParticipantEntity> participantList = participantService.getAllParticipants();
		
		return participantList;
	}

}

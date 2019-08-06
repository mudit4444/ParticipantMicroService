package com.example.demo.Controller;

import java.util.List;

//import com.example.Repository.ParticipantRepository;
import com.example.demo.Service.ParticipantService;
import com.example.demo.model.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ParticipantController{
	
	Logger log = LoggerFactory.getLogger(ParticipantController.class);
	
	  @Autowired
	  ParticipantService participantService;
	
	  
	@RequestMapping("/participant")
	public List<ParticipantEntity> getAllParticipant() {
		List<ParticipantEntity> participantList = participantService.getAllParticipants();
		log.info("The participant list of all participant is being returned");
		return participantList;
	}
	
	
	@RequestMapping("/search/{id}")
	public ParticipantEntity searchParticipant(@PathVariable String id) {
		
		log.info("Participant list for specific id" +id +" is being returned");
		//logic to write and return a value on being called
		return participantService.getParticipant(id);
		
		
	}

}

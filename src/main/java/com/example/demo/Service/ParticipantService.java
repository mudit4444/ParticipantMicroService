package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.Repository.ParticipantRepository;
import com.example.demo.model.ParticipantEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {
	
	@Autowired
	ParticipantRepository repo;
	
	//List<ParticipantEntity> myList = new ArrayList<ParticipantEntity>();
	
	public List<ParticipantEntity> getAllParticipants() {
		
		//List<ParticipantEntity> allParticipant = new ArrayList<>();
		return repo.findAll();
		
	}

}

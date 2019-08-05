package com.example.Service;

import com.example.Repository.ParticipantRepository;
import com.example.model.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {
	
	@Autowired
	ParticipantRepository repo;
	
	public List<ParticipantEntity> getAllParticipants() {
		
		//List<ParticipantEntity> allParticipant = new ArrayList<>();
		return repo.findAll();
		
	}

}

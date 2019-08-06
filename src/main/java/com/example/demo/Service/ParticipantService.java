package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.demo.Repository.ParticipantRepository;
import com.example.demo.model.ParticipantEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {
	
	@Autowired
	ParticipantRepository repo;
	
	List<ParticipantEntity> myList = new ArrayList<>(Arrays.asList(
				new ParticipantEntity("1" , "ashish", "Sengar" , "15566223"),
				new ParticipantEntity("2" , "Dinesh" , "Sharma" , "159753215"))
			);
	
	
	public List<ParticipantEntity> getAllParticipants() {
		repo.findAll().forEach(myList::add);
		return myList;
		
	}
	
	
	public ParticipantEntity getParticipant(String id) {
		return myList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}

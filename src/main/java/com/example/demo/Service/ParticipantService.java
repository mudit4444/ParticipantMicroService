package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.Repository.ParticipantRepository;
import com.example.demo.model.ParticipantEntity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {
	
	@Autowired
	ParticipantRepository repo;
	Logger log = LoggerFactory.getLogger(ParticipantService.class);
	
	/*
	 * List<ParticipantEntity> myList = new ArrayList<>(Arrays.asList( new
	 * ParticipantEntity("1" , "ashish", "Sengar" , "15566223"), new
	 * ParticipantEntity("2" , "Dinesh" , "Sharma" , "159753215")) );
	 */
	private static Map<String,List<ParticipantEntity>> participantMap = new HashMap<String, List<ParticipantEntity>>();
	
	static{
		participantMap = new HashMap<String, List<ParticipantEntity>>();
		List<ParticipantEntity> myList = new ArrayList<ParticipantEntity>();
		ParticipantEntity parti = new ParticipantEntity("1", "Manmohan" , "Singh" , "100100100");
		myList.add(parti);
		ParticipantEntity parti1 = new ParticipantEntity("2", "Rajiv", "Gandhi", "200200200");
		myList.add(parti1);
		
		participantMap.put("Participant1", myList);
		
	}
	
	
	public List<ParticipantEntity> getAllParticipants() {
		/*
		 * repo.findAll().forEach(myList::add); return myList;
		 */
		return null;
	}
	
	
	public List<ParticipantEntity> getParticipant(String id) {
		List<ParticipantEntity> lst = participantMap.get(id);
		
		if(lst == null) {
			log.error("List is empty");
		}
		
		return lst;
	}

}

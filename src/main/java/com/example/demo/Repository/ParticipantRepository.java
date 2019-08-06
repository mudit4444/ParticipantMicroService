package com.example.demo.Repository;


import com.example.demo.model.ParticipantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends CrudRepository<ParticipantEntity, Integer>{
	
	

}

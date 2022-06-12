package com.room.rooms.facility;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacilityService {
     @Autowired
	FacilityRepository facilityRepository;
// add facility records
   public FacilateEntity addFacility(FacilateEntity add) {  
	return  facilityRepository.save(add);
	   
   }
   //views all facility
   public List<FacilateEntity> viewAll(){
	   return facilityRepository.findAll();
   }
   
   //update facility
   public FacilateEntity updateFacility(FacilateEntity add , Long facilityId) throws Exception {  
		FacilateEntity getId =  facilityRepository.findById(facilityId).orElseThrow(()-> new Exception("facility not exists"));
		getId.setFacilityName(add.getFacilityName());
		getId.setDescription(add.getDescription());
		getId.setCreatedBy(add.getCreatedBy());
		getId.setCreatedOn(add.getCreatedOn());

		return  facilityRepository.save(getId);
		
		   
	   }
	   
	
}

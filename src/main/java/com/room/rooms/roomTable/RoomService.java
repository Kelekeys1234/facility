package com.room.rooms.roomTable;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.room.rooms.facility.FacilateEntity;
import com.room.rooms.facility.FacilityRepository;

@Service
public class RoomService {
   @Autowired
	RoomRepository roomRepository;
   @Autowired
   FacilityRepository facilityRepository;
   
   //add rooms 
   public RoomEntity addRooms(RoomEntity addRoom ,Long facilateId) throws Exception {
	  FacilateEntity facility= facilityRepository.findById(facilateId).orElseThrow(()-> new Exception(" facility does not exist"));
	   RoomEntity roomEntity = new RoomEntity(addRoom.getRoomNumber() ,facility);
	   return roomRepository.save(roomEntity);
	   
   }
   //view all rooms
   public List<RoomEntity> ViewAllRoom(){
	   return roomRepository.findAll();
   }
}

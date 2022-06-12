package com.room.rooms.roomTable;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	@Autowired
	RoomService roomService;
	
	@PostMapping("save/{Id}")
	public RoomEntity addRooms(@RequestBody RoomEntity room , @PathVariable("Id") Long facilityId ) throws Exception {
		RoomEntity rooms = roomService.addRooms(room, facilityId);
		return rooms;
	}
	@GetMapping("getAllRoom")
	public List<RoomEntity> getAllRooms(){
		return  roomService.ViewAllRoom();
	}

}

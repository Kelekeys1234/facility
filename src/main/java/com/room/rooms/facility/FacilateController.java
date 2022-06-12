package com.room.rooms.facility;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facility")
public class FacilateController {
	@Autowired
	FacilityService facilityService;
	
	
	@PostMapping("/addFacility")
	public FacilateEntity AddFacility(@RequestBody FacilateEntity add) {
		return facilityService.addFacility(add);
	}
	@GetMapping("getAllfacility")
	public List<FacilateEntity> viewFaclity(){
		return facilityService.viewAll();
	}

}

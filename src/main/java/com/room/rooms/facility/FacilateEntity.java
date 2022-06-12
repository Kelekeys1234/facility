package com.room.rooms.facility;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="facilityRooms")
public class FacilateEntity {
	 @Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long FacilityId;
	
	public String FacilityName;
	
	public String  Description ;
	
	public LocalDateTime CreatedOn;
	
	public String CreatedBy;

	public Long getFacilityId() {
		return FacilityId;
	}

	public void setFacilityId(Long facilityId) {
		FacilityId = facilityId;
	}

	public String getFacilityName() {
		return FacilityName;
	}

	public void setFacilityName(String facilityName) {
		FacilityName = facilityName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public LocalDateTime getCreatedOn() {
		return CreatedOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		CreatedOn = createdOn;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	public FacilateEntity() {
		super();
	}
	
	
	
	
}


package com.room.rooms.roomTable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.room.rooms.facility.FacilateEntity;

@Entity
@Table(name ="room")
public class RoomEntity {
	 @Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roomId;
	
	private Long roomNumber;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn( name = "room_facility_id", referencedColumnName="FacilityId")
	private FacilateEntity facilateId;

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Long getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Long roomNumber) {
		this.roomNumber = roomNumber;
	}

	public RoomEntity() {
		super();
	}

	public FacilateEntity getFacilateId() {
		return facilateId;
	}

	public void setFacilateId(FacilateEntity facilateId) {
		this.facilateId = facilateId;
	}

	public RoomEntity(Long roomNumber, FacilateEntity facilateId) {
		super();
		this.roomNumber = roomNumber;
		this.facilateId = facilateId;
	}
	
	 

}

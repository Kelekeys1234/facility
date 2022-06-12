package com.room.rooms.facility;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FacilityRepository extends JpaRepository<FacilateEntity,Long>{

}

package com.ty.AirportDB.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.AirportDB.dto.Booking;
import com.ty.AirportDB.dto.PassengerDetails;

public interface BookingRepository extends JpaRepository<Booking, Integer>{
	
	@Query("select p from PassengerDetails p where p.passenger_id in (select b.passenger_id from Booking b) ")
	List<PassengerDetails> getDetails();
}

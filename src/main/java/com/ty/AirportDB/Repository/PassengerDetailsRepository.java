package com.ty.AirportDB.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.AirportDB.dto.Passenger;
import com.ty.AirportDB.dto.PassengerDetails;

public interface PassengerDetailsRepository extends JpaRepository<PassengerDetails, Passenger> {

//	@Query("Select s from Passenger s LEFT JOIN PassengerDetails m on s.passenger_id=m.passenger_id")
//	List<Passenger> getAllData(Passenger passenger,PassengerDetails passengerDetails);

	@Query("Select p from PassengerDetails p where p.passenger_id in (Select d.passenger_id from Passenger d)")
	ArrayList<PassengerDetails> getAllDetails();
}

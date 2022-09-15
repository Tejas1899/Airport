package com.ty.AirportDB.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.AirportDB.dto.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
	

	@Query("Select p from Passenger p where firstname=?1")
	List<Passenger> getAllByFirstName(String name);
}

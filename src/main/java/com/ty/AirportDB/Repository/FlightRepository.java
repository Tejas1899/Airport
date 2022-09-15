package com.ty.AirportDB.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.AirportDB.dto.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
	@Query("select f from Flight f where f.arrival=?1")
	List<Flight> getByArrivalDate(String dateTime);
}

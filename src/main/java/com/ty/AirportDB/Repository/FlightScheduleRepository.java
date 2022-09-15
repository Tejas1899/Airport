package com.ty.AirportDB.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ty.AirportDB.dto.FlightSchedule;

public interface FlightScheduleRepository extends JpaRepository<FlightSchedule, String> {

	
}

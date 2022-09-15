package com.ty.AirportDB.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AirportDB.Repository.FlightScheduleRepository;
import com.ty.AirportDB.dto.FlightSchedule;

@Repository
public class FlightScheduleDao {

	@Autowired
	private FlightScheduleRepository flightScheduleRepository;

	public FlightSchedule saveFlight(FlightSchedule flightSchedule) {
		return flightScheduleRepository.save(flightSchedule);
	}

	public List<FlightSchedule> getAll() {
		return flightScheduleRepository.findAll();
	}
}

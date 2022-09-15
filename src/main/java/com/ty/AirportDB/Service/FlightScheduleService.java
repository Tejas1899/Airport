package com.ty.AirportDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AirportDB.dao.FlightScheduleDao;
import com.ty.AirportDB.dto.FlightSchedule;

@Service
public class FlightScheduleService {

	@Autowired
	private FlightScheduleDao flightScheduleDao;

	public FlightSchedule saveFlight(FlightSchedule flightSchedule) {
		return flightScheduleDao.saveFlight(flightSchedule);
	}

	public List<FlightSchedule> getAll() {
		return flightScheduleDao.getAll();
	}

}

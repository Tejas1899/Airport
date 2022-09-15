package com.ty.AirportDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.AirportDB.Service.FlightScheduleService;
import com.ty.AirportDB.dto.FlightSchedule;

@RestController
public class FlightScheduleController {

	@Autowired
	private FlightScheduleService flightScheduleService;

	@PostMapping("/schedules")
	public FlightSchedule saveFlight(@RequestBody FlightSchedule flightSchedule) {
		return flightScheduleService.saveFlight(flightSchedule);
	}

	@GetMapping("/schedules")
	public List<FlightSchedule> getAll() {
		return flightScheduleService.getAll();
	}
}

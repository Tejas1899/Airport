package com.ty.AirportDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.AirportDB.Service.PassengerDetailsService;
import com.ty.AirportDB.dto.Passenger;
import com.ty.AirportDB.dto.PassengerDetails;

@RestController
public class PassengerDetailsController {

	@Autowired
	private PassengerDetailsService passengerDetailsService;

	@GetMapping("/details")
	public List<PassengerDetails> getAll() {
		return passengerDetailsService.getAll();
	}

	@GetMapping("/detailss")
	public List<PassengerDetails> getAllDeatails() {
		return passengerDetailsService.getAllDetails();
	}
}

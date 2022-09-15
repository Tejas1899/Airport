package com.ty.AirportDB.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AirportDB.Repository.PassengerDetailsRepository;
import com.ty.AirportDB.dto.Passenger;
import com.ty.AirportDB.dto.PassengerDetails;

@Repository
public class PassengerDetailsDao {

	@Autowired
	private PassengerDetailsRepository passengerDetailsRepository;

	public List<PassengerDetails> getAll() {
		return passengerDetailsRepository.findAll();
	}

	public List<PassengerDetails> getAllDetails() {
		return passengerDetailsRepository.getAllDetails();
	}
}

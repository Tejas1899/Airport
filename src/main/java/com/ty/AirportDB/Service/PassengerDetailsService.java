package com.ty.AirportDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.AirportDB.dao.PassengerDetailsDao;
import com.ty.AirportDB.dto.Passenger;
import com.ty.AirportDB.dto.PassengerDetails;

@Service
public class PassengerDetailsService {

	@Autowired
	private PassengerDetailsDao detailsDao;

	public List<PassengerDetails> getAll() {
		return detailsDao.getAll();
	}

	public List<PassengerDetails> getAllDetails() {
		return detailsDao.getAllDetails();
	}
}

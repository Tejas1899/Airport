package com.ty.AirportDB.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airline {
	@Id
	private int airline_id;
	private String iata;
	private String airlinename;

	public int getAirline_id() {
		return airline_id;
	}

	public void setAirline_id(int airline_id) {
		this.airline_id = airline_id;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getAirlinename() {
		return airlinename;
	}

	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}

}

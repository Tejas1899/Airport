package com.ty.AirportDB.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	private double flight_id;
	private String flightno;
	private double from;
	private double to;
	private String departure;
	private String arrival;
	private double airline_id;
	private double airplane_id;

//	@OneToMany(mappedBy = "flight",cascade = CascadeType.ALL)
//	private Booking booking;
	public double getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(double flight_id) {
		this.flight_id = flight_id;
	}

	public String getFlightno() {
		return flightno;
	}

	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}

	public double getFrom() {
		return from;
	}

	public void setFrom(double from) {
		this.from = from;
	}

	public double getTo() {
		return to;
	}

	public void setTo(double to) {
		this.to = to;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public double getAirline_id() {
		return airline_id;
	}

	public void setAirline_id(double airline_id) {
		this.airline_id = airline_id;
	}

	public double getAirplane_id() {
		return airplane_id;
	}

	public void setAirplane_id(double airplane_id) {
		this.airplane_id = airplane_id;
	}

}

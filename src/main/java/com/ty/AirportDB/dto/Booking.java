package com.ty.AirportDB.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	private double booking_id;
	private double flight_id;
	private String seat;
	private double passenger_id;
	private double price;

	public double getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(double booking_id) {
		this.booking_id = booking_id;
	}

	public double getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(double flight_id) {
		this.flight_id = flight_id;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public double getPassenger_id() {
		return passenger_id;
	}

	public void setPassenger_id(double passenger_id) {
		this.passenger_id = passenger_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn
//	private Passenger passenger;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn
//	private Flight flight;

}

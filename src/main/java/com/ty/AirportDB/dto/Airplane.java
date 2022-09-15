package com.ty.AirportDB.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airplane {
	@Id
	private double airplane_id;
	private double capacity;
	private double type_id;
	private double airline_id;
	public double getAirplane_id() {
		return airplane_id;
	}
	public void setAirplane_id(double airplane_id) {
		this.airplane_id = airplane_id;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public double getType_id() {
		return type_id;
	}
	public void setType_id(double type_id) {
		this.type_id = type_id;
	}
	public double getAirline_id() {
		return airline_id;
	}
	public void setAirline_id(double airline_id) {
		this.airline_id = airline_id;
	}
	
	

}

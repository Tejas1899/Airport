package com.ty.AirportDB.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WeatherData {
	@Id
	private LocalDate log_date;
	private LocalDateTime time;
	private int station;
	private double temp;
	private double humidity;
	private double airpressure;
	private double wind;
	private int winddirection;

	public int getWinddirection() {
		return winddirection;
	}

	public void setWinddirection(int winddirection) {
		this.winddirection = winddirection;
	}

	public LocalDate getLog_date() {
		return log_date;
	}

	public void setLog_date(LocalDate log_date) {
		this.log_date = log_date;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public int getStation() {
		return station;
	}

	public void setStation(int station) {
		this.station = station;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getAirpressure() {
		return airpressure;
	}

	public void setAirpressure(double airpressure) {
		this.airpressure = airpressure;
	}

	public double getWind() {
		return wind;
	}

	public void setWind(double wind) {
		this.wind = wind;
	}

}

package com.ty.AirportDB.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class PassComp implements Serializable {
	private int passenger_id;

	public int getPassenger_id() {
		return passenger_id;
	}

	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}

	@Override
	public String toString() {
		return "PassComp [passenger_id=" + passenger_id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(passenger_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassComp other = (PassComp) obj;
		return passenger_id == other.passenger_id;
	}

}

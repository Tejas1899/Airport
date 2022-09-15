package com.ty.AirportDB.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.AirportDB.Repository.EmployeeRepository;
import com.ty.AirportDB.dto.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(double id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		} else {
			return optional.get();
		}
	}
}

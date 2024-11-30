package org.hivebyte.airlinereservationsystem.service;

import org.hivebyte.airlinereservationsystem.entity.Passenger;
import org.hivebyte.airlinereservationsystem.exceptionhandling.PassengerNotFoundException;

import java.util.List;

public interface PassengerService {

	public List<Passenger> findAll();
	public Passenger findById(int passengerId) throws PassengerNotFoundException;
	public void deleteById(int passengerId) throws PassengerNotFoundException;
	public Passenger save(Passenger passenger);
	// view passenger by bookingTicket Id
}

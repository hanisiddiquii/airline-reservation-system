package org.hivebyte.airlinereservationsystem.service;


import org.hivebyte.airlinereservationsystem.entity.Flight;
import org.hivebyte.airlinereservationsystem.exceptionhandling.FlightNotFoundException;

import java.util.List;

public interface FlightService {

	public Flight findById(int flightId) throws FlightNotFoundException;
	public void deleteById(int flightId) throws FlightNotFoundException;
	public Flight save(Flight flight);
	// view by source and destination
	public List<Flight> findByDestination(String destination);
	public List<Flight> findBySource(String source);
	
	public List<Flight> findAll();
	
}

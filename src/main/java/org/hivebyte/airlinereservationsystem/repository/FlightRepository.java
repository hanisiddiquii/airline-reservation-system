package org.hivebyte.airlinereservationsystem.repository;

import org.hivebyte.airlinereservationsystem.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface FlightRepository extends JpaRepository<Flight, Integer>{
	
	@Query("select f from Flight f where f.destination = :destination")
	public List<Flight> findByDestination(String destination);
	
	@Query("select f from Flight f where f.source = :source")
	public List<Flight> findBySource(String source);

	@Query("select f from Flight f where f.source = :source and f.destination = :destination")
	public List<Flight> findBySourceDestination(String source,String destination);
	
	public List<Flight> findByFlightNumber(String flightNumber);
	
	public void deleteByFlightNumber(String flightNumber);
}

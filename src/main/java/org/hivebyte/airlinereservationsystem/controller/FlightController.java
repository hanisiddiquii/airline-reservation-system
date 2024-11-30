package org.hivebyte.airlinereservationsystem.controller;

import org.hivebyte.airlinereservationsystem.entity.Flight;
import org.hivebyte.airlinereservationsystem.exceptionhandling.FlightNotFoundException;
import org.hivebyte.airlinereservationsystem.repository.FlightRepository;
import org.hivebyte.airlinereservationsystem.service.FlightService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/fly")
public class FlightController {
	@Autowired
	private FlightService flightService;
	
	@Autowired
	private FlightRepository flightRepository;

	public FlightController(FlightService flightService) {
		super();
		this.flightService = flightService;
	}

	@PostMapping("/flights") // create
	public ResponseEntity<Flight> addFlight(@Valid @RequestBody Flight flight){
		flight.setFlightId(0);
		Flight newFlight = flightService.save(flight);
		return ResponseEntity.status(HttpStatus.CREATED).body(newFlight);
	}

	@GetMapping("/flights/{flightId}")  // read
	public Flight findById(@PathVariable("flightId") int  flightId) throws FlightNotFoundException {
		Flight flight = flightService.findById(flightId);
		return flight;
	}
	
	
	@GetMapping("/flights/flightNum/{flightNumber}")  // read
	public List<Flight> findByFlightNumber(@PathVariable String  flightNumber) throws FlightNotFoundException {
		List<Flight> flight = flightRepository.findByFlightNumber(flightNumber);
		return flight;
	}
	
	@GetMapping("/flights/source/{source}")  // read
	public List<Flight> findBySource(@PathVariable String source) throws FlightNotFoundException {
		List<Flight> flight = flightService.findBySource(source);
		return flight;
	}
	
	@GetMapping("/flights/destination/{destination}")  // read
	public List<Flight> findByDestination(@PathVariable String destination) throws FlightNotFoundException {
		List<Flight> flight = flightService.findByDestination(destination);
		return flight;
	}
	
	@GetMapping("/flights/{source}/{destination}")
	public List<Flight> findBySoureDestination(@PathVariable("source") String source,@PathVariable("destination") String destination) {
		
		List<Flight> flight = flightRepository.findBySourceDestination(source,destination);
		return flight;
	}
	
	@GetMapping("/flights")
	public List<Flight> findAllFlights()
	{
		return flightService.findAll();
	}
	
	@PutMapping("/flights") // update 
	public ResponseEntity<Flight> updateFlight(@Valid @RequestBody Flight flight){
		Flight newFlight = flightService.save(flight);
		return ResponseEntity.status(HttpStatus.CREATED).body(newFlight);
	}

	@DeleteMapping("flights/{flightId}") // delete
	public String deleteById(@PathVariable  int flightId) throws FlightNotFoundException {
		flightService.deleteById(flightId);
		return " Flight with Id "+flightId+" is  Deleted Successfully ....";
	}
	
	@Transactional
	@DeleteMapping("flights/flightNum/{flightNumber}")
	public String deleteByFlightNumber(@PathVariable String flightNumber) throws FlightNotFoundException
	{
		flightRepository.deleteByFlightNumber(flightNumber);
		return "Flight with Number"+flightNumber+" is deleted Successfully...";
	}
	
}




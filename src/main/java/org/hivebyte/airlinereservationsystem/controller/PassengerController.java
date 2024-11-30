package org.hivebyte.airlinereservationsystem.controller;


import org.hivebyte.airlinereservationsystem.entity.Passenger;
import org.hivebyte.airlinereservationsystem.exceptionhandling.PassengerNotFoundException;
import org.hivebyte.airlinereservationsystem.service.PassengerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/pass")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
		super();
		this.passengerService = passengerService;
	}

    
    @GetMapping("/passengers")  // read
	public List<Passenger> findAll() {
		return passengerService.findAll();
	}

    @GetMapping("/passengers/{passengerId}")  // read
	public Passenger findById(@PathVariable("passengerId") int passengerId) throws PassengerNotFoundException {
		Passenger passenger = passengerService.findById(passengerId);
		return passenger;
	}

    @PostMapping("/passengers")
    public ResponseEntity<Passenger> addPassenger(@Valid @RequestBody Passenger passenger){
        Passenger newPassenger = passengerService.save(passenger);
        return ResponseEntity.status(HttpStatus.CREATED).body(newPassenger);
    }



    @DeleteMapping("/passengers/{passengerId}")
	public String deleteById(@PathVariable int passengerId) throws PassengerNotFoundException {
		passengerService.deleteById(passengerId);
		return  " Passenger with Id "+passengerId+" is  Deleted Successfully ....";
	}
}



package org.hivebyte.airlinereservationsystem.service;

import org.hivebyte.airlinereservationsystem.bean.Airport;
import org.hivebyte.airlinereservationsystem.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    public void addAirport(Airport airport) {
    	 airport.setAirportCode(airport.getAirportCode().toUpperCase());
         airport.setAirportLocation(airport.getAirportLocation().toUpperCase());
        airportRepository.save(airport);
    }

    public Airport showAirport(String airportCode) {
        return airportRepository.findById(airportCode).orElse(null);
    }

    public List<Airport> showAllAirports() {
        return airportRepository.findAll();
    }
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }
    
   

   
    
   
}
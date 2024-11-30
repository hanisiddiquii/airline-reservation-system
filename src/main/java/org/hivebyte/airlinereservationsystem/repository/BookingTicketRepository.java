package org.hivebyte.airlinereservationsystem.repository;

import org.hivebyte.airlinereservationsystem.entity.BookingTicket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingTicketRepository extends JpaRepository<BookingTicket, Integer>{

	 List<BookingTicket> findByFlight_FlightId(int flightId);
	 
	// To find all bookings for a specific user
	    List<BookingTicket> findByUser_UserId(int userId);
	   // List<BookingTicket> findAll();
}

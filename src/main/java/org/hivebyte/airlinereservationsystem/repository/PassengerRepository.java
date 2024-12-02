package org.hivebyte.airlinereservationsystem.repository;

import org.hivebyte.airlinereservationsystem.bean.Passenger;
import org.hivebyte.airlinereservationsystem.bean.TicketPassengerEmbed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, TicketPassengerEmbed> {
	List<Passenger> findByEmbeddedIdTicketNumber(Long ticketNumber);
	
	
	List<Passenger> findByEmbeddedId_TicketNumberOrderByEmbeddedId_SerialNumber(Long ticketNumber);
    List<Passenger> findAllByOrderByEmbeddedId_TicketNumberAsc();
}
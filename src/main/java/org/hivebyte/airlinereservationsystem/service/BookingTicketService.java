package org.hivebyte.airlinereservationsystem.service;

import org.hivebyte.airlinereservationsystem.entity.BookingTicket;
import org.hivebyte.airlinereservationsystem.entity.TransactionDetails;
import org.hivebyte.airlinereservationsystem.exceptionhandling.BookingTicketNotFoundException;

import java.util.List;


public interface BookingTicketService {
    
    BookingTicket save(BookingTicket bookingTicket);
    
    void deleteBookingById(int bookingId) throws BookingTicketNotFoundException;
    
    BookingTicket getBookingById(int bookingId) throws BookingTicketNotFoundException;

    List<BookingTicket> findByFlight_FlightId(int flightId) throws BookingTicketNotFoundException;
    
 // New method to find bookings by user ID
    List<BookingTicket> findByUser_UserId(int userId) throws BookingTicketNotFoundException;
    TransactionDetails createTransaction(Double amount);

}

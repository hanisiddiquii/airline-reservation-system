package org.hivebyte.airlinereservationsystem.repository;

import org.hivebyte.airlinereservationsystem.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
    
}
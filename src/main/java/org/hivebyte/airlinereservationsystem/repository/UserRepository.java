package org.hivebyte.airlinereservationsystem.repository;

import org.hivebyte.airlinereservationsystem.bean.FlightUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<FlightUser, Long> {
    FlightUser findByEmail(String email);
    FlightUser findByUsername(String username);

}
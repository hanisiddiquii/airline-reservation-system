package org.hivebyte.airlinereservationsystem.repository;

import org.hivebyte.airlinereservationsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByEmailIdAndPassword(String emailId,String password);
	Optional<User> findByEmailId(String emailId);

}

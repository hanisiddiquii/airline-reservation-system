package org.hivebyte.airlinereservationsystem.repository;

import org.hivebyte.airlinereservationsystem.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
	@Query("SELECT p FROM Payment p WHERE p.user.userId = :userId")
	List<Payment> findByUserId(@Param("userId") int userId);

}

package org.hivebyte.airlinereservationsystem.repository;



import org.hivebyte.airlinereservationsystem.bean.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}

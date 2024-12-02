package org.hivebyte.airlinereservationsystem.service;



import org.hivebyte.airlinereservationsystem.bean.Feedback;
import org.hivebyte.airlinereservationsystem.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public void saveFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
    }
}

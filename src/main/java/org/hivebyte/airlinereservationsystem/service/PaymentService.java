package org.hivebyte.airlinereservationsystem.service;

import org.hivebyte.airlinereservationsystem.entity.Payment;

import java.util.List;


public interface PaymentService {

	    Payment addPayment(Payment payment, int orderId, int userId);

	    List<Payment> getAllPayments();

	    Payment getPaymentById(long paymentId);

	    void deletePayment(long paymentId);

	    List<Payment> getAllPaymentsByUserId(int userId);
}



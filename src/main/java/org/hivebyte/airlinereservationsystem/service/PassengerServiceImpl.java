package org.hivebyte.airlinereservationsystem.service;

import org.hivebyte.airlinereservationsystem.entity.Passenger;
import org.hivebyte.airlinereservationsystem.exceptionhandling.PassengerNotFoundException;
import org.hivebyte.airlinereservationsystem.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerRepository passengerRepository;

	public PassengerServiceImpl(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@Override
	public List<Passenger> findAll() {
		return passengerRepository.findAll();
	}

	@Override
	public Passenger findById(int passengerId) throws PassengerNotFoundException {
		Optional<Passenger> result = passengerRepository.findById(passengerId);
		Passenger passenger;
		if (result.isPresent()) {
			passenger = result.get();
		} else {
			throw new PassengerNotFoundException("Passenger With Id " + passengerId + " Not Found ");
		}
		return passenger;
	}

	@Override
	public Passenger save(Passenger passenger) {
		return passengerRepository.save(passenger);
	}

	@Override
	public void deleteById(int passengerId) throws PassengerNotFoundException {
		if (passengerRepository.existsById(passengerId)) {
			passengerRepository.deleteById(passengerId);
		} else {
			throw new PassengerNotFoundException("Passenger With Id " + passengerId + " Not Found ");
		}

	}

}

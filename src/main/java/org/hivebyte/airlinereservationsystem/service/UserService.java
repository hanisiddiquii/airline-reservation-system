package org.hivebyte.airlinereservationsystem.service;

import org.hivebyte.airlinereservationsystem.entity.User;
import org.hivebyte.airlinereservationsystem.exceptionhandling.UserNotFoundException;

import java.util.List;

public interface UserService {

	User saveUser(User user);
    User loginUser(User user) throws UserNotFoundException;
	//User updateUser(User user, int userId);
	User getUserById(int userId)  throws UserNotFoundException;
	List<User> getAllUser();
	User getUserByEmail(User user) throws UserNotFoundException;
	void deleteUser(int userId)  throws UserNotFoundException;
}

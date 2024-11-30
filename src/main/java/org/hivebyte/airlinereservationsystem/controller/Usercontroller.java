package org.hivebyte.airlinereservationsystem.controller;

import org.hivebyte.airlinereservationsystem.entity.User;
import org.hivebyte.airlinereservationsystem.repository.UserRepository;
import org.hivebyte.airlinereservationsystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/users")
public class Usercontroller {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository uRepository;

	
	
	public Usercontroller(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/register")
	public ResponseEntity<User> saveUser(@Valid @RequestBody User user) {

		return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
	}

//Login
	@PostMapping("/login")
	public ResponseEntity<User> loginUser(@RequestBody User user) {

		return new ResponseEntity<User>(userService.loginUser(user), HttpStatus.OK);

	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int userId) {
		return new ResponseEntity<User>(userService.getUserById(userId), HttpStatus.OK);
	}
	
	@PostMapping("/forgotpassword")
	public User getUserByEmail(@RequestBody User user) {
		return uRepository.findByEmailId(user.getEmailId()).get();
	}
	
	//Get All Customer	
	@GetMapping()
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	

	//Delete Customer	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable("id") int userId) {
		userService.deleteUser(userId);
		boolean flag = true;
		return new ResponseEntity<Boolean>(flag, HttpStatus.OK);
	}
	
	@PostMapping("/changepassword/{newpassword}")
	public User changeUserPassword(@RequestBody User user,@PathVariable("newpassword") String newpassword) {
		//return customerService.getCustomerByEmail(customer);
	 
		User u=uRepository.findByEmailId(user.getEmailId()).get();
		u.setPassword(newpassword);
		userService.saveUser(u);
		return u;
	}
	

}

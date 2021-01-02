package com.khaled.mongoDB.SpringbootMongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khaled.mongoDB.SpringbootMongo.model.User;
import com.khaled.mongoDB.SpringbootMongo.repository.UserRepository;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping(value = "/{userId}")
	public Optional<User> getUser(@PathVariable String userId) {
		return userRepository.findById(userId);
	}

	@PostMapping()
	public User addNewUsers(@RequestBody User user) {
		return userRepository.save(user);
	}

	@PutMapping()
	public User updateUsers(@RequestBody User user) {
		return userRepository.save(user);
	}

	@DeleteMapping(value = "/{userId}")
	public void deleteUser(@PathVariable String userId) {
		 userRepository.deleteById(userId);
	}
		
}

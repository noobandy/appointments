package appointments.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import appointments.model.User;
import appointments.model.UserRepository;

@RestController
public class UserController {

	private UserRepository userRepository;
	
	public ResponseEntity<String> createUser(User user) {
		userRepository.create(user);
	}
}

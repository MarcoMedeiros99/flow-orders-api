package io.github.marcoMedeiros.flow_orders_backend.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.marcoMedeiros.flow_orders_backend.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "31 9 9878-9887", "123321");
		return ResponseEntity.ok().body(u);
	}
	
}

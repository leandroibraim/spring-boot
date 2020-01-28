package com.ibraim.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibraim.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> procuraTodos() {

		User u = new User(1L, "Joao", "joao@gmail", "789789789", "123");

		return ResponseEntity.ok().body(u);

	}
}

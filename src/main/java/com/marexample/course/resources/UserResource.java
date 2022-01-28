package com.marexample.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marexample.course.entities.User;

@RestController  //controlador
@RequestMapping(value = "/users") // mapamento endicando o caminho
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "44444","l2345");
		return ResponseEntity.ok().body(u);
	}
}

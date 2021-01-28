package com.course.springCourse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.springCourse.entities.User;

@RestController
@RequestMapping (value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findall(){
		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "123456");
		
		return ResponseEntity.ok().body(u);
	}
}

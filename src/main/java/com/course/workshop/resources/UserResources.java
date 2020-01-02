package com.course.workshop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.workshop.entities.User;
import com.course.workshop.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
		@Autowired //injeção de dependencias
		private UserService service; 
		@GetMapping
		public ResponseEntity<List<User>> findAll(){
			List<User> list = service.findAll();
			return ResponseEntity.ok().body(list);
		}
		
		@GetMapping(value="/{id}")
		public ResponseEntity<User> findById(@PathVariable Long id){
			User obj = service.findById(id);
			return ResponseEntity.ok().body(obj);
		}
}



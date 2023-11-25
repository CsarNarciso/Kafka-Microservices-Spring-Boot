package com.cesar.Users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController()
@RequestMapping("/users")
public class Controller {

	@GetMapping("/{userId}/conversations")
	private ResponseEntity<?> getConversations_request(@PathVariable Long userId){
		
		kafkaTemplate.send("getConversations", userId.toString());
	
		return ResponseEntity.ok( restTemplate.getForObject( "http://localhost:8002/conversations/" + userId, String.class ));
	}
	
	
	
	@Autowired
	private KafkaTemplate<Integer, String> kafkaTemplate;
	
	@Autowired
	private RestTemplate restTemplate;
}

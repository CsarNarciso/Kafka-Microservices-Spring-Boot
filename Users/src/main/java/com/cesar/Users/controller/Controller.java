package com.cesar.Users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class Controller {

	@GetMapping("/{userId}/conversations")
	private void getConversations_producer(@PathVariable String userId){
		
		template.send("getConversations_producer", userId);
	}
	
	
	@Autowired
	private KafkaTemplate<Integer, String> template;
}

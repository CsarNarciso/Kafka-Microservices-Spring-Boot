package com.cesar.Conversations.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesar.Conversations.entity.Conversation;

@RestController
@RequestMapping("/conversations")
public class Controller {

	@GetMapping("/{userId}")
	private ResponseEntity<?> getByUserId(@PathVariable Long userId) {
		
		List<String> userConversations = conversations.stream()
				.filter( c -> c.getIdSender().equals(userId) )
				.map( c -> c.getNameAddressee() ).toList();
		
		return ResponseEntity.ok( userConversations ); 
	}

	
	private List<Conversation> conversations = Arrays.asList(
			
			new Conversation(Long.valueOf(5), "Jack"),
			new Conversation(Long.valueOf(1), "Alexa"),
			new Conversation(Long.valueOf(5), "Jenna")
			);
}

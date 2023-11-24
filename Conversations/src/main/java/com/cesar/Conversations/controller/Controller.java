package com.cesar.Conversations.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Controller {

	@KafkaListener(id = "getConversations", topics = "getConversations_producer")
	public void getConversations_consumer(Long idUser) {
		
		System.out.println( "------------" + idUser );
	}
	
//	private List<Conversation_DTO> conversations = Arrays.asList(
//			
//			new Conversation_DTO(5, "Jack"),
//			new Conversation_DTO(1, "Alexa"),
//			new Conversation_DTO(5, "Joel")
//			);
}

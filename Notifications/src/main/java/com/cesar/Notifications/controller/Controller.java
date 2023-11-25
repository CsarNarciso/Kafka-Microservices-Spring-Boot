package com.cesar.Notifications.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Controller {

	@KafkaListener( id="getConversations_notify", topics="getConversations" )
	public void getConversations( String userId ) {
		
		System.out.println( "Notifying to another microservices, email services, etc: 'User " + userId + " had to check their conversations'" );
	}
}

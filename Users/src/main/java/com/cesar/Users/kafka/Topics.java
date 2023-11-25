package com.cesar.Users.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Topics {

	@Bean
	public NewTopic getConversations() {
		
		return TopicBuilder.name( "getConversations" )
				.partitions( 2 )
				.replicas( 1 )
				.build();
	}
}

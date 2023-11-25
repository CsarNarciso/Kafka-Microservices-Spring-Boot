package com.cesar.Notifications.kafka;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

@Configuration
@EnableKafka
public class KafkaConfiguration {

	@Bean
	public KafkaListenerContainerFactory< ConcurrentMessageListenerContainer<String, String> > kafkaListenerContainerFactory(){
		
		Map<String, Object> configs = new HashMap<>();
		configs.put( ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG , "localhost:9092" );
		configs.put( ConsumerConfig.CLIENT_ID_CONFIG , "msvc-notifications" );
		configs.put( ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG , StringDeserializer.class );
		configs.put( ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG , StringDeserializer.class );
		
		ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory( new DefaultKafkaConsumerFactory<>( configs ));
		
		return factory;
	}
}

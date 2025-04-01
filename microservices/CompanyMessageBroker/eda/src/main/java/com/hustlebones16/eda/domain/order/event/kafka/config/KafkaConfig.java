package com.hustlebones16.eda.domain.order.event.kafka.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.function.Consumer;

@Configuration
public class KafkaConfig {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Bean
    public Consumer<String> input(){
        return message ->{
            kafkaTemplate.send("orders-topic", message);
        };
    }
}

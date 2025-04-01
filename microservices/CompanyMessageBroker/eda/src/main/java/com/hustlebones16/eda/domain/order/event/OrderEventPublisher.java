package com.hustlebones16.eda.domain.order.event;


import com.hustlebones16.eda.domain.order.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class OrderEventPublisher {
    private Consumer<String> input;

    @Autowired
    public OrderEventPublisher(Consumer<String> input){
        this.input = input;
    }

    public void publishOrderCreatedEvent(Order order){
        String payload = order.toJson();
    }
}

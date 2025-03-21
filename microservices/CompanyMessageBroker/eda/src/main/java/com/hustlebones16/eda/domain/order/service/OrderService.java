package com.hustlebones16.eda.domain.order.service;

import com.hustlebones16.eda.domain.order.repository.OrderRepository;
import com.hustlebones16.eda.domain.outbox.repository.OutboxEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private OrderRepository orderRepository;
    private OutboxEventRepository outboxEventRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, OutboxEventRepository outboxEventRepository){
        this.orderRepository = orderRepository;
        this.outboxEventRepository = outboxEventRepository;
    }


}

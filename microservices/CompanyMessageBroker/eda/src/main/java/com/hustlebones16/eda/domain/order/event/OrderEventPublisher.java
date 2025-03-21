package com.hustlebones16.eda.domain.order.event;


import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.transform.Source;

@EnableBinding(Sink.class)
public class OrderEventPublisher {
    @Autowired
    public OrderEventPublisher(Source source){

    }
}

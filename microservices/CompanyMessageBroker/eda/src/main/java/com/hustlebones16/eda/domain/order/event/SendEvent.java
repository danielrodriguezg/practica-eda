package com.hustlebones16.eda.domain.order.event;

@FunctionalInterface
public interface SendEvent {
    void send(String message);
}

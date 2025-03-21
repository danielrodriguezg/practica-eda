package com.hustlebones16.eda.domain.outbox.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OutboxEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String aggregateType; // Tipo de agregado (ej: "Order")
    private String aggregateId;   // ID del agregado (ej: "order123")
    private String eventType;     // Tipo de evento (ej: "OrderCreated")
    private String payload;       // Datos del evento en JSON
}

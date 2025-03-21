/**
 * SCRIPT PARA CREAR LAS TABLAS DE LA BASE DE DATOS DEL PRODUCER
 * -Creado por Daniel Rodriguez
 * -Username en YouTube y Twitch: hustlebones16
 */

----1. CREATE TABLE OutboxEvent para manejo de eventos
CREATE TABLE outbox_event (
    id BIGSERIAL PRIMARY KEY,  -- Usamos BIGSERIAL para autoincremento en PostgreSQL
    aggregate_type VARCHAR(255) NOT NULL,  -- Tipo de agregado (ej: "Order")
    aggregate_id VARCHAR(255) NOT NULL,    -- ID del agregado (ej: "order123")
    event_type VARCHAR(255) NOT NULL,      -- Tipo de evento (ej: "OrderCreated")
    payload JSONB NOT NULL,                -- Datos del evento en JSON (usamos JSONB para mejor rendimiento)
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP  -- Fecha de creación del evento
);

--Usamos indices para mejorar el performance de la tabla
CREATE INDEX idx_outbox_event_aggregate_id ON outbox_event (aggregate_id);
CREATE INDEX idx_outbox_event_event_type ON outbox_event (event_type);

--Hagamos una insert de prueba
INSERT INTO outbox_event (aggregate_type, aggregate_id, event_type, payload)
VALUES ('Order', 'order123', 'OrderCreated', '{"orderId": "order123", "status": "CREATED"}');

--select sencillo
select * from outbox_event oe ;

----2. CREATE TABLE Order para guardar las ordenes de compra (usamos nombre purchase_order porque order es una palabra reservada del motor de db)
create table purchase_order (
	id BIGSERIAL primary key, --clave primaria de la tabla
	order_id VARCHAR(255) not null, --orderId del JSON
	status VARCHAR(255) not null	
);

--Usamos indices para mejorar el performance de la tabla
CREATE INDEX idx_purchase_order_order_id ON purchase_order (order_id);

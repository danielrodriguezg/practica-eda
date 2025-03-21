# Patrón Saga con Spring Boot y Kafka

Este proyecto es una implementación práctica del **Patrón Saga** utilizando **Spring Boot** y **Apache Kafka**. El objetivo es demostrar cómo manejar **transacciones distribuidas** en una arquitectura de microservicios basada en eventos.

## 🚀 **Características principales**
- Implementación del **Patrón Saga** (Orquestada y Coreografiada).
- Uso de **Kafka** como sistema de mensajería para la comunicación entre servicios.
- Manejo de **errores y compensaciones** para garantizar la consistencia de los datos.
- Ejemplo práctico de un sistema de pedidos en línea con los siguientes servicios:
  - **Servicio de Pedidos**: Crea y gestiona pedidos.
  - **Servicio de Pagos**: Procesa pagos.
  - **Servicio de Envíos**: Gestiona el envío de pedidos.

## 🛠 **Tecnologías utilizadas**
- **Java**: Lenguaje de programación.
- **Spring Boot**: Framework principal para la construcción de microservicios.
- **Apache Kafka**: Broker de mensajes para la comunicación asíncrona.
- **Spring Cloud Stream**: Integración de Kafka con Spring Boot.
- **PostgreSQL**: Base de datos SQL con el modelo de datos del Broker.
- **Lombok**: Para reducir el código boilerplate.
- **MongoDB**: Base de datos NoSQL con el modelo de datos del cliente.
- **Docker**: plataforma de software que permite crear, probar, implementar, actualizar y gestionar aplicaciones en contenedores.


## 📂 **Estructura del proyecto**
El proyecto está dividido en los siguientes módulos:
1. **order-service**: Servicio de pedidos.
2. **payment-service**: Servicio de pagos.
3. **shipping-service**: Servicio de envíos.
4. **common**: Módulo compartido con DTOs, eventos y configuraciones comunes.

## 🚀 **Cómo ejecutar el proyecto**

### **Requisitos previos**
- Java 17 o superior.
- Docker
- Git

### **Pasos para ejecutar**
1. Clona el repositorio:
   ```bash
   git clone https://github.com/danielrodriguezg/practica-eda
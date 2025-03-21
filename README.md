# Patrón Saga con Spring Boot y Kafka

**Realizado por Daniel Alejandro Rodriguez Gomez**

Este proyecto es una implementación práctica del **Patrón Saga** utilizando **Spring Boot** y **Apache Kafka**. El objetivo es demostrar cómo manejar **transacciones distribuidas** en una arquitectura de microservicios basada en eventos.

## 🚀 **Características principales**
- Implementación del **Patrón Saga** (Orquestada y Coreografiada).
- Uso de **Kafka** como sistema de mensajería para la comunicación entre servicios.
- Manejo de **errores y compensaciones** para garantizar la consistencia de los datos.
- Ejemplo práctico de un sistema de pedidos en línea con los siguientes servicios:
  - **CompanyMessageBroker**: Envia ordenes recibidas por usuarios en el broker de mensajeria.
  - **CompanyClient**: Obtiene las ordenes enviadas por los usuarios al broker de mensajeria.

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
1. **docker**: Directorio con los docker compose del producer (CompanyMessageBroker) y consumer (CompanyClient).
2. **microservices**: Microservicios para la implementacion del broker de mensajeria y el cliente que obtiene los mensajes de las ordenes de compra. Se componen de CompanyClient y CompanyMessageBroker.
3. **mongo**: Directorio con los scripts de la base de datos NoSQL del cliente (CompanyClient).
4. **postgres**: Directorio con los scripts SQL de la base de datos con el modelo de datos de Broker de mensajeria (CompanyMessageBroker).
5. **Diagrama de arquitectura sencilla.png**: Contiene el diagrama de componentes del proyecto.
6. **Librerias en Spring Boot Initializr - consumer.png**: Contiene las dependencias usadas para crear el proyecto del cliente (CompanyClient) usando Spring Boot.
7.  **Librerias en Spring Boot Initializr - producer.png**: Contiene las dependencias usadas para crear el proyecto del Broker de mensajeria (CompanyMessageBroker) usando Spring Boot.
8.  **Links utiles EDA.md**: Contiene Links utiles para estudiar mas a fondo los temas tocados en los videos.

## 🚀 **Cómo ejecutar el proyecto**

### **Requisitos previos**
- Java 17 o superior.
- Docker.
- Git.
- IntelliJ Community (o Ultimate en caso que tengas licencia paga).

### **Pasos para ejecutar**
1. Clona el repositorio:
   ```bash
   git clone https://github.com/danielrodriguezg/practica-eda

### **Videos y canales**
- Canal de YouTube: https://www.youtube.com/@hustlebones16
- Canal de Twitch: https://www.twitch.tv/hustlebones16
- Video con la explicación teórica: https://www.youtube.com/watch?v=0fat8nAsntg&t=1315s

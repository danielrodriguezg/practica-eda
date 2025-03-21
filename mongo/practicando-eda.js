/**
 * SCRIPT PARA CREAR LOS DOCUMENTOS DE MONGO LA BASE DE DATOS DEL CONSUMER
 * -Creado por Daniel Rodriguez
 * -Username en YouTube y Twitch: hustlebones16
 */

// Conectar a la base de datos (si no estás conectado automáticamente)
//use admin;  // ya que abrimos el intellishell en la base de datos no es necesario

// Insertar el documento en una colección
db.orders.insertOne({
    "status": "CREATED",
    "orderId": "order123"
});
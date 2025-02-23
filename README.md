Este proyecto es una API REST desarrollada en Spring Boot, diseñada para gestionar productos mediante operaciones CRUD (Crear, Leer, Actualizar y Eliminar).

**⚙️ Configuración del Proyecto**
La estructura del proyecto fue generada automáticamente con Spring Initializr (***https://start.spring.io/***) con los siguientes ajustes:

- Group: com.ejemplo
- Artifact: productos-api
- Name: productos-api
- Description: API REST para gestionar productos
- Package Name: com.ejemplo.productosapi
- Packaging: Jar
- Java: 17

**🔧 Funcionalidades**
La API permite:

✔ Crear productos (POST /productos)
✔ Obtener todos los productos (GET /productos)
✔ Actualizar un producto por ID (PUT /productos/{id})
✔ Eliminar un producto por ID (DELETE /productos/{id})

**🛠 Ejemplo de Uso con Postman**
📌 Crear un Producto (POST)
- URL: *http://localhost:8080/productos*
- Body (JSON):
```
{
  "nombre": "Camiseta Negra",
  "precio": 19.99
}
```

📌 Obtener Productos (GET)
URL: *http://localhost:8080/productos*

📌 Actualizar un Producto (PUT)
- URL: *http://localhost:8080/productos/1* (el número final debe ser el id del registro)
- Body (JSON)
```
{
  "nombre": "Camiseta Roja",
  "precio": 14.95
}
```

📌 Eliminar un Producto (DELETE)
URL: *http://localhost:8080/productos/1*
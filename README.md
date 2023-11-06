# Hibernate CRUD Example

Este proyecto es un ejemplo de una aplicación CRUD (Crear, Leer, Actualizar, Eliminar) que utiliza Hibernate y Java Swing para gestionar productos en una base de datos MySQL.

## Descripción

La aplicación permite realizar las siguientes operaciones:

- Agregar un nuevo producto.
- Modificar un producto existente.
- Eliminar un producto por su ID.
- Buscar un producto por su ID.
- Limpiar los campos del formulario.

## Requisitos

Asegúrate de tener instalados los siguientes componentes:

- Java Development Kit (JDK)
- Apache Maven
- MySQL (o el sistema de gestión de bases de datos de tu elección)
- Una base de datos llamada "tienda" en MySQL (o puedes cambiar el nombre en la configuración)

## Configuración

1. Clona o descarga este repositorio en tu máquina local.

2. Verifica la configuración de Hibernate en el archivo `hibernate.cfg.xml`. Asegúrate de que los detalles de conexión a la base de datos sean correctos.

3. Ejecuta el proyecto Maven para compilarlo: mvn clean install
   
4. Ejecuta la aplicación: java -jar target/hibernateCRUD-1.0-SNAPSHOT.jar


## Uso

- Ejecuta la aplicación.
- Utiliza los botones para agregar, modificar, eliminar, buscar y limpiar productos.
- Ingresa los datos en los campos de texto según sea necesario.
- Observa cómo los productos se registran en la base de datos.

## Contribuciones

Si deseas contribuir o mejorar este proyecto, siéntete libre de hacer un _fork_ y enviar tus _pull requests_.

## Licencia

Este proyecto se distribuye bajo la [Licencia MIT](LICENSE).



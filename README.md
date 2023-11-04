# Aplicación CRUD Java con JDBC y MVC

Este es un proyecto de ejemplo de una aplicación CRUD (Crear, Leer, Actualizar, Eliminar) en Java utilizando JDBC para interactuar con una base de datos MySQL. La aplicación sigue el patrón de diseño Modelo-Vista-Controlador (MVC) para mantener una estructura organizada.

## Requisitos

Asegúrate de tener instalado lo siguiente en tu entorno de desarrollo:

- Java Development Kit (JDK)
- MySQL Database
- IDE de desarrollo Java (por ejemplo, Eclipse, NetBeans, IntelliJ IDEA)

## Configuración de la base de datos

1. Crea una base de datos MySQL llamada `crud_java`.
2. Ejecuta el script SQL proporcionado en `src/resources/database.sql` para crear la tabla `producto`.

## Configuración de la aplicación

1. Abre el proyecto en tu IDE de desarrollo.
2. Asegúrate de que las bibliotecas JDBC de MySQL estén incluidas en el proyecto.
3. Modifica la configuración de la conexión a la base de datos en `src/resources/application.properties` con tus propios valores:

   ```properties
   url=jdbc:mysql://localhost:3306/crud_java
   usuario=tu_usuario_mysql
   contraseña=tu_contraseña_mysql

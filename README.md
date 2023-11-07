# Ejemplo de Aplicación Spring Boot con Thymeleaf

Este proyecto es un ejemplo de una aplicación web desarrollada con Spring Boot y Thymeleaf que permite administrar productos. Los usuarios pueden agregar, editar y eliminar productos a través de una interfaz web.

## Requisitos

Asegúrate de tener instalados los siguientes requisitos antes de ejecutar la aplicación:

- Java Development Kit (JDK) 8 o superior
- Apache Maven (si estás utilizando Maven)
- IDE de desarrollo (p. ej., Spring Tool Suite, IntelliJ IDEA, Eclipse)
- Navegador web para acceder a la interfaz de usuario

## Configuración

1. Clona este repositorio o descarga el código fuente.

2. Abre el proyecto en tu IDE de desarrollo.

3. Asegúrate de que las dependencias de Spring Boot están configuradas correctamente en tu archivo `pom.xml`. Esto incluye las dependencias para Spring Data JPA, Spring Web y Thymeleaf.

```xml
<dependencies>
    <!-- Dependencias de Spring Boot -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
    <!-- Otras dependencias... -->
</dependencies>
```

Configura tu base de datos en el archivo application.properties o application.yml según tus necesidades.
```
spring.datasource.url=jdbc:mysql://localhost:3306/tu_basededatos
spring.datasource.username=usuario
spring.datasource.password=contraseña
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
```

Ejecuta la aplicación desde tu IDE o utilizando Maven. La aplicación se iniciará en el puerto 8080 por defecto.

## Accede a la aplicación desde tu navegador web utilizando la siguiente URL:
```
http://localhost:8080/
```

La interfaz web te permitirá listar productos, agregar nuevos, editar existentes y eliminarlos.

## Estructura del Proyecto
src/main/java/com/example/demo: Contiene las clases Java de la aplicación, incluyendo la entidad Producto, el repositorio, el servicio y el controlador.
src/main/resources/templates: Contiene las plantillas Thymeleaf para las páginas web (form.html e index.html).

## Contribución
Si deseas contribuir a este proyecto, siéntete libre de crear pull requests o informar sobre problemas. Estamos abiertos a mejoras y sugerencias.

## Licencia
Este proyecto está bajo la Licencia MIT. Puedes ver los detalles en el archivo LICENSE.

# Proyecto #5 Screenplay Web - SerenityBDD 🚀

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Ingresa a la página https://www.saucedemo.com/ y dependiendo del ambiente seleccionado realiza login con usuario y contraseña las cuales están en archivo serenity.conf,desde este archivo se puede configurar el navegador.

## Pre requisitos para ejecutar 📋
- Java version 1.8 o superior y JDK (variables de entorno configuradas).
- Entorno de desarrollo: Eclipse IDE o IntelliJ IDEA
- Maven version 3.9.6 o superior (variables de entorno configuradas).

## Archivos de configuración entorno de ejecución de las pruebas 🗒️

| Archivo              | ¿Utiliza? |
| ---------------------|-------------- |
| serenity.conf        | SI            |
| serenity.properties  | SI            |

Archivo serenity.conf

- Configuraciones generales: Nombre del proyecto, capturas de pantalla, modo headless en falso.
- Configuracion del webdriver: Parametrizado para navegador Edge (ventana maximizada, modo incognito, sin extensiones)
- Configuracion de ambientes: 4 ambientes de prueba (defalul, dev, qa, uat) todas apuntan a la url https://www.saucedemo.com/, pero cada una maneja credenciales de ingreso diferentes.  

Archivo serenity.properties 

- Agrega campos adicionales al reporte: tagtypes, environment, appversion, user, squad, order.

## Ejecutar pruebas 🔨

Limpiar el proyecto y luego compilar el código fuente. Esto es útil para asegurarte de que el código se compile correctamente antes de pasar a fases posteriores del ciclo de vida del proyecto, como las pruebas o el empaquetado.

	mvn clean compile

Ejecutar prueba usando navegador Edge seleccionando el ambiente default:

 	mvn clean verify -Denvironment=default

Ejecutar prueba usando navegador Edge seleccionando el ambiente dev:

 	mvn clean verify -Denvironment=dev

Ejecutar prueba usando navegador Edge seleccionando el ambiente QA:

 	mvn clean verify -Denvironment=QA

Ejecutar prueba usando navegador Edge seleccionando el ambiente UAT:

 	mvn clean verify -Denvironment=UAT
  
Genera el informe Serenity BDD, no ejecuta las pruebas en navegador

	mvn serenity:aggregate 

Importante: Si se ejecuta solo el comando `mvn clean verify` tomara las credenciales registradas en ambiente default. <br />
Nota: los ambientes deben escribirse en terminal tal y como están escritos en serenity.conf, si se escriben en minúscula o mayúscula sino corresponden va a generar error la ejecución.


## Ver los informes 🔍
El comando proporcionado anteriormente para la ejecución de las pruebas, generará un informe de prueba de Serenity **index.html** en el directorio target\site\serenity\index.html

## Navegador Web 🌐
- El navegador por defecto es Edge, pero es posible cambiarlo desde archivo serenity.conf.
- El proyecto no hace uso de drivers .exe para abrir un navegador. 

## Construido con 🛠
La automatización fue desarrollada con:
- BDD - Estrategia de desarrollo
- POM - Patrón de diseño (Page Object Model)
- Maven - Administrador de dependencias
- Selenium Web Driver - Herramienta para interactuar con navegadores web
- Serenity BDD - Librería de código abierto para escribir pruebas de aceptación automatizadas

## Versionamiento 📌
Se usó Git para el control de versiones. 🔀

# Autor 👨
***Víctor Andrés León Ballén*** - [vandres777@gmail.com]()
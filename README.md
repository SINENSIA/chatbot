# chatbot
Simple ChatBot con Spring Boot y Angular usando IBM Watson Assistant

# Puesta en marcha:
Clona el repositorio git clone https://github.com/SINENSIA/chatbot.git

** Entra en el directorio **
cd chatbot
cd backend

** Ejecuta maven clean & install **
mvn clean
mvn install

Crea un archivo application.properties en la carpeta backend/src/main/resources
He introduce las credenciales de tu servicio chatbot (sigue la guía para localizar las credenciales)

** Ejecuta la aplicación con maven **
mvn spring-boot:run

** Accede a http://localhost:8080 ***
Envia un mensaje con
http://localhost:8080/send/hola

Entra en la directorio frontend/

Ejecuta composer install

Después ejecuta 
ng serve

** Accede a http://localhost:4200 **
para probar la aplicación frontend miesntras se está ejecutando la aplicación backend.
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes

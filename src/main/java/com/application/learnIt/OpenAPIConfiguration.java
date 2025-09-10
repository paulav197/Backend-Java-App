package com.application.learnIt;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfiguration {

   @Bean
   public OpenAPI defineOpenApi() {
       Server server = new Server();
       server.setUrl("http://localhost:8080");
       server.setDescription("API DAM2 class");

       Contact myContact = new Contact();
       myContact.setName("Paula Alcazar");
       myContact.setEmail("241@alumnos.fpsumma.es");

       Info information = new Info()
               .title("Juego Palabras")
               .version("1.0")
               .description("Permite jugar al encriptar y desencriptar palabras.")
               .contact(myContact);
       return new OpenAPI().info(information).servers(List.of(server));
   }
}
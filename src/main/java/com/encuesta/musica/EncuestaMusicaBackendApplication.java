package com.encuesta.musica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.encuesta.modelo")
@ComponentScan("com.encuesta.controlador")
@EnableJpaRepositories("com.encuesta.repositorio")
public class EncuestaMusicaBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EncuestaMusicaBackendApplication.class, args);
    }

}

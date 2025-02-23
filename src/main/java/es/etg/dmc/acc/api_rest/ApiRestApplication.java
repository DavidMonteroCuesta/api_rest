package es.etg.dmc.acc.api_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class})
public class ApiRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiRestApplication.class, args);
    }
}

/*
	./mvnw spring-boot:run
	http://localhost:8080/productos
 */

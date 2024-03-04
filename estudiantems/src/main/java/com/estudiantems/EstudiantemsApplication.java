package com.estudiantems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EstudiantemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudiantemsApplication.class, args);
	}

}

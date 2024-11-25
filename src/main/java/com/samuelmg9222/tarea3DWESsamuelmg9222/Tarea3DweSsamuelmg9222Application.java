package com.samuelmg9222.tarea3DWESsamuelmg9222;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tarea3DweSsamuelmg9222Application {

	@Bean
	public Principal applicationStartUpRunner() {
		return new Principal();
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea3DweSsamuelmg9222Application.class, args);
	}

}

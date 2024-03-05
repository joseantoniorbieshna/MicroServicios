package com.cursoms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoms.client.StudentClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/curso")
public class CursoController {
	@Autowired
	private StudentClient studentClient;
	
	@GetMapping("/uno")
	@CircuitBreaker(name = "fallback", fallbackMethod = "fallbackRes")
	public String getCurso(){
		return studentClient.getEstudiante().getBody()+"de mi";
	}

	public String fallbackRes(Throwable t){
		return "fallback rescate";
	}
}

package com.cursoms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoms.client.StudentClient;

@RestController
@RequestMapping("/curso")
public class CursoController {
	@Autowired
	private StudentClient studentClient;
	
	@GetMapping("/uno")
	public ResponseEntity<?> getCurso(){
		return studentClient.getEstudiante();
	}

}

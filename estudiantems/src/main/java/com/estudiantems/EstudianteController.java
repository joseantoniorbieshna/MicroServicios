package com.estudiantems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
	
	@GetMapping("/uno")
	public ResponseEntity<String> getEstudiante(){
		return ResponseEntity.ok("Soy un estudiante");
	}
}

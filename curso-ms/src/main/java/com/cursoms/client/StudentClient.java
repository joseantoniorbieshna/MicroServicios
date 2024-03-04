package com.cursoms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="ms-estudiante")
public interface StudentClient {
	
	@GetMapping("estudiante/uno")
	public ResponseEntity<String> getEstudiante();
}

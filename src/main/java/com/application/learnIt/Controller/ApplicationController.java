package com.application.learnIt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.learnIt.IService.ApplicationInterService;
import com.application.learnIt.Models.Ejercicio;
import com.application.learnIt.Models.Libro;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ApplicationController {
	
	@Autowired
	private ApplicationInterService applicationService;
	
	@GetMapping("/allBooks")
	public List<Libro> obtenerLibros(){
		return applicationService.getAll();
	}
	
	@GetMapping("/book/{id}")
	public Libro getBookById(@PathVariable("id") Long id) {
		return applicationService.obtenerById(id);
	}
	
	@PostMapping("/ejercicio")
	public Ejercicio crearEjercicio(@RequestBody Ejercicio nuevoEjercicio) {
		return applicationService.guardarEjercicio(nuevoEjercicio);
	}
}

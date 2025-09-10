package com.application.learnIt.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.learnIt.IService.ApplicationInterService;
import com.application.learnIt.Models.Ejercicio;
import com.application.learnIt.Models.Libro;
import com.application.learnIt.Repository.EjercicioRepository;
import com.application.learnIt.Repository.LibroRepository;

import jakarta.transaction.Transactional;

@Service
public class ApplicationService implements ApplicationInterService{
	
	@Autowired
	private LibroRepository libroRepository;
	
	@Autowired
	private EjercicioRepository ejercicioRepo;
	
	@Override
	public List<Libro> getAll() {
		// TODO Auto-generated method stub
		return libroRepository.findAll();
	}
	
	@Transactional
	@Override
	public Libro obtenerById(Long id) {
		// TODO Auto-generated method stub
		Libro libro = libroRepository.findById(id).orElse(null);
		
		if(libro.getTextPage() != null) {
			libro.getTextPage().size();
		}
		
		return libro;
	}

	@Override
	public Ejercicio guardarEjercicio(Ejercicio nuevoEjercicio) {
		// TODO Auto-generated method stub
		return ejercicioRepo.save(nuevoEjercicio);
	}
	
}

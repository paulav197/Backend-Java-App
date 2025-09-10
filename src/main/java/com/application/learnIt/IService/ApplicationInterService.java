package com.application.learnIt.IService;
import java.util.List;
import com.application.learnIt.Models.Ejercicio;
import com.application.learnIt.Models.Libro;

public interface ApplicationInterService {

	List<Libro> getAll();

	Libro obtenerById(Long id);

	Ejercicio guardarEjercicio(Ejercicio nuevoEjercicio);



}

package com.application.learnIt.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.application.learnIt.Models.Ejercicio;

@Repository
public interface EjercicioRepository extends JpaRepository<Ejercicio, Long>{

}

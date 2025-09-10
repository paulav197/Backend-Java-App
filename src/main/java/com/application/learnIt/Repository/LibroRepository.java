package com.application.learnIt.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.learnIt.Models.Libro;


@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

}

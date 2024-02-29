package com.EjercicioPractico1.dao;

import com.EjercicioPractico1.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroDao extends JpaRepository<Libro, Long> {
    
}

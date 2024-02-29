package com.EjercicioPractico1.service;

import com.EjercicioPractico1.domain.Libro;

import java.util.List;

public interface LibroService {
    List<Libro> obtenerLibros(boolean activos);
}

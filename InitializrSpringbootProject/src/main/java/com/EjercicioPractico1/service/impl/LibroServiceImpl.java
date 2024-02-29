package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.dao.LibroDao;
import com.EjercicioPractico1.domain.Libro;
import com.EjercicioPractico1.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroDao libroDao;

    @Override
    @Transactional(readOnly = true)
    public List<Libro> obtenerLibros(boolean activos) {
        List<Libro> listaLibros = libroDao.findAll();
        if (activos) {
            listaLibros = listaLibros.stream().filter(Libro::isActivo).collect(Collectors.toList());
        }
        return listaLibros;
    }
}

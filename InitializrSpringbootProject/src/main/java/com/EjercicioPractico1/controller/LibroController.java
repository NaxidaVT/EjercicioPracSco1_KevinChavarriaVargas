package com.EjercicioPractico1.controller;

import com.EjercicioPractico1.domain.Libro;
import com.EjercicioPractico1.service.LibroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/libros")
    public String listarLibros(Model model) {
        try {
            List<Libro> libros = libroService.obtenerLibros(false);
            model.addAttribute("libros", libros);
            model.addAttribute("totalLibros", libros.size());
        } catch (Exception e) {
            log.error("Error al obtener la lista de libros", e);
            model.addAttribute("error", "Se produjo un error al obtener la lista de libros.");
        }
        return "libro/listado";
    }
}

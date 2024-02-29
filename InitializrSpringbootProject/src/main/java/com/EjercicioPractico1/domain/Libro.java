package com.EjercicioPractico1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "libro")

public class Libro implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    
    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "autor")
    private Integer autor;

    @Column(name = "precio")
    private String precio;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "activo")
    private boolean activo;

    public Libro() {
    }

    public Libro(Long id, String titulo, Integer autor, String precio, String categoria, boolean activo) {
        this.id = id;
        this.titulo = titulo;
        this.activo = activo;
    }    
}
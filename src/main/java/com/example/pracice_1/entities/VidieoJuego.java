package com.example.pracice_1.entities;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name = "Videojuego")
public class VidieoJuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "titulo",length = 30 ,nullable = false)
    private String titulo;
    @Column(name = "genero",nullable = false,length = 20)
    private String genero;
    @Column(name = "precio",nullable = false)
    private double precio;
    @Column(name = "fechaLanzamiento",nullable = false)
    private DateFormat fechaLanzamiento;
    @Column(name = "personajeClave", nullable = false)
    private String personajeClave;

    public VidieoJuego() {
    }

    public VidieoJuego(int id, String titulo, String genero, double precio, DateFormat fechaLanzamiento, String personajeClave) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.fechaLanzamiento = fechaLanzamiento;
        this.personajeClave = personajeClave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public DateFormat getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(DateFormat fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getPersonajeClave() {
        return personajeClave;
    }

    public void setPersonajeClave(String personajeClave) {
        this.personajeClave = personajeClave;
    }
}

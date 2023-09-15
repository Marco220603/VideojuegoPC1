package com.example.pracice_1.dtos;

import java.text.DateFormat;

public class VideojuegoDTO {

    private int id;
    private String titulo;
    private String genero;
    private double precio;
    private DateFormat fechaLanzamiento;
    private String personajeClave;

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

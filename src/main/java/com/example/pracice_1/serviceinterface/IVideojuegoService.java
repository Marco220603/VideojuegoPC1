package com.example.pracice_1.serviceinterface;

import com.example.pracice_1.entities.VidieoJuego;

import java.util.List;

public interface IVideojuegoService {
    public void insert(VidieoJuego vidieoJuego);
    public List<VidieoJuego> list();
    List<VidieoJuego> findByTitulo(String titulo);
    //public List<String[]>cantidadVideojuegosprecio();
}

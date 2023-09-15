package com.example.pracice_1.repository;

import com.example.pracice_1.entities.VidieoJuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVideojuegoRepository extends JpaRepository<VidieoJuego,Integer> {
    List<VidieoJuego> findByTitulo(String titulo);

    //List<String[]>cantidadporPrecio();
}

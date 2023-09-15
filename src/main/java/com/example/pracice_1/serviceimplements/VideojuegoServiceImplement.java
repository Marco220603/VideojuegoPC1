package com.example.pracice_1.serviceimplements;

import com.example.pracice_1.entities.VidieoJuego;
import com.example.pracice_1.repository.IVideojuegoRepository;
import com.example.pracice_1.serviceinterface.IVideojuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoServiceImplement implements IVideojuegoService {
    @Autowired
    private IVideojuegoRepository vR;
    @Override
    public void insert(VidieoJuego vidieoJuego) {
        vR.save(vidieoJuego);
    }
    @Override
    public List<VidieoJuego> list() {
        return vR.findAll();
    }
    @Override
    public List<VidieoJuego> findByTitulo(String titulo) {
        return vR.findByTitulo(titulo);
    }


}

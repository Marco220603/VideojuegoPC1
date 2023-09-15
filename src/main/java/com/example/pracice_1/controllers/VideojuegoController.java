package com.example.pracice_1.controllers;

import com.example.pracice_1.dtos.VideojuegoDTO;
import com.example.pracice_1.entities.VidieoJuego;
import com.example.pracice_1.serviceinterface.IVideojuegoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/videojuegos")
public class VideojuegoController {
    @Autowired
    private IVideojuegoService vS;
    @PostMapping
    public void registrar(@RequestBody VideojuegoDTO dto){
        ModelMapper m = new ModelMapper();
        VidieoJuego v = m.map(dto,VidieoJuego.class);
        vS.insert(v);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<VideojuegoDTO> listar(){
        return vS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,VideojuegoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscarporTitulo")
    public List<VideojuegoDTO>buscarporTitulo(@RequestBody String titulo){
        return vS.findByTitulo(titulo).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,VideojuegoDTO.class);
        }).collect(Collectors.toList());
    }

}

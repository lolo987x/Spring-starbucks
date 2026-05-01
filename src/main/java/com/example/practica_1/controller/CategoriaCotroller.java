package com.example.practica_1.controller;

import com.example.practica_1.model.Categoria;
import com.example.practica_1.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")

public class CategoriaCotroller{
    private final CategoriaService service;

    public CategoriaCotroller(CategoriaService service){
        this.service = service;
    }

    @GetMapping
    public List<Categoria>listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Categoria Buscar(@PathVariable Long id){
        return service.buscarPorId(id);
    }

}
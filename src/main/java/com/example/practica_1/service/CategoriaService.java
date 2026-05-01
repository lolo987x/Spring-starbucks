package com.example.practica_1.service;

import com.example.practica_1.model.Categoria;
import com.example.practica_1.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService{
    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository){
        this.repository = repository; 
    }

    public List<Categoria>listar (){
        return repository.findAll();
    }

    public Categoria buscarPorId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Categoria no encontrada"));
    }
}
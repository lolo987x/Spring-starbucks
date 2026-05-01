package com.example.practica_1.service;

import com.example.practica_1.model.Producto;
import com.example.practica_1.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService{
    private final ProductoRepository repository;
    
    public ProductoService(ProductoRepository repository){
        this.repository = repository;
    }

    public List<Producto> listar(){
        return repository.findAll();
    }

    public Producto buscarPorId(Long id ){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    public Producto agregarProducto(Producto producto) {
        return repository.save(producto);
    }

    public void eliminar (Long id){
        repository.deleteById(id);
    }
}
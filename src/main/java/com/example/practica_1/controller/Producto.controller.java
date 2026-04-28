package com.example.practica_1.controller;

import com.example.practica_1.model.Producto;
import com.example.practica_1.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")

public class ProductoController{
    private final ProductoService service;

    public ProductoController(ProductoService service){
        this.service = service;
    }

    @GetMapping
    public List<Producto>listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Producto buscar(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public Producto crear(@RequestBody Producto producto){
        return service.guardar(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        service.eliminar(id);
    }
}
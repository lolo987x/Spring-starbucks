package com.example.practica_1.controller;

import com.example.practica_1.model.Cliente;
import com.example.practica_1.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")

public class ClienteController{
    private final ClienteService service;

    public ClienteController(ClienteService service){
        this.service = service;
    }

    @GetMapping
    public List<Cliente>listar(){
        return service.listar();
    }

    @PostMapping
    public Cliente crear(@RequestBody Cliente cliente){
        return service.agregarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        service.eliminar(id);
    }

    
}
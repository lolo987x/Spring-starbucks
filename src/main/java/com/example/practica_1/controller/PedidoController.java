package com.example.practica_1.controller;

import com.example.practica_1.model.Pedido;
import com.example.practica_1.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")

public class PedidoController{
    private final PedidoService service;

    public PedidoController(PedidoService service){
        this.service = service;
    }

    @GetMapping
    public List<Pedido>listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Pedido buscar(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public Pedido crear(@RequestBody Pedido pedido){
        return service.agregarPedido(pedido);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        service.eliminar(id);
    }
}

package com.example.practica_1.controller;

import com.example.practica_1.model.ItemPedido;
import com.example.practica_1.service.ItemPedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/itempedidos")
public class ItemPedidoController {

    private final ItemPedidoService service;

    public ItemPedidoController(ItemPedidoService service){
        this.service = service;
    }

    @GetMapping
    public List<ItemPedido> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public ItemPedido buscar(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public ItemPedido crear(@RequestBody ItemPedido itemPedido){
        return service.agregarItemPedido(itemPedido);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        service.eliminar(id);
    }
}
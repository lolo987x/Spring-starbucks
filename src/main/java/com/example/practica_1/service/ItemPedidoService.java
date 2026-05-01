package com.example.practica_1.service;

import com.example.practica_1.model.ItemPedido;
import com.example.practica_1.repository.ItemPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPedidoService{
    private final ItemPedidoRepository repository;

    public ItemPedidoService(ItemPedidoRepository repository){
        this.repository = repository;
    }

    public List<ItemPedido>listar(){
        return repository.findAll();
    }

    public ItemPedido buscarPorId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("ItemPedido no encontrado"));
    }

    public ItemPedido agregarItemPedido(ItemPedido itemPedido){
        return repository.save(itemPedido);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }
}
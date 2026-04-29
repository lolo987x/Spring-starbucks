package com.example.practica_1.service;

import com.example.practica_1.model.Pedido;
import com.example.practica_1.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService{
    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository){
        this.repository = repository;
    }

    public List<Pedido>listar(){
        return repository.findAll();
    }

    public Pedido buscarPorId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
    }

    public Pedido guardarPedido(Pedido pedido){
        return repository.save(pedido);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }
}
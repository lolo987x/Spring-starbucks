package com.example.practica_1.service;

import com.example.practica_1.model.Cliente;
import com.example.practica_1.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository repository;

    public ClienteService (ClienteRepository repository){
        this.repository = repository;
    }

    public List<Cliente>listar(){
        return repository.findAll();
    }

    public Cliente buscarPorId (Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

    public Cliente agregarCliente(Cliente cliente){
        return repository.save(cliente);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }
}

package com.example.practica_1.repository;

import com.example.practica_1.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}
package com.example.practica_1.controller;

import com.example.practica_1.model.Pedido;
import com.example.practica_1.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")

public class PedidoController{
    private final PedidoService service;

}

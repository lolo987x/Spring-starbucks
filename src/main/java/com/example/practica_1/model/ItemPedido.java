package com.example.practica_1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "item_pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cantidad;
    private double precioUnitario;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Long getId(){
        return id;
    }
    public void setId (Long id ){
        this.id = id;
    }

    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public double getPrecioUnitario(){
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario){
        this.precioUnitario = precioUnitario;
    }

    public Pedido getPedido(){
        return pedido;
    }
    public void setPedido(Pedido pedido){
        this.pedido= pedido;
    }

    public Producto getProducto(){
        return producto;
    }
    public void setProducto(Producto producto){
        this.producto = producto;
    }

    public Categoria getCategoria(){
        return categoria;
    }
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
}
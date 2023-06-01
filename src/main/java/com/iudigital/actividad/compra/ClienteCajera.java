package com.iudigital.actividad.compra;

import com.iudigital.actividad.compra.cliente.producto.ClienteProducto;
import com.iudigital.actividad.compra.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;


public class ClienteCajera {

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        
        ClienteProducto cliente1 = new ClienteProducto("Cliente 1", productos);
        ClienteProducto cliente2 = new ClienteProducto("Cliente 2", productos);
        
        long tiempoinicial = System.currentTimeMillis();
        CajeraProducto cajera1 = new CajeraProducto("Juliana");
        CajeraProducto cajera2 = new CajeraProducto("Lida");
        
        cajera1.procesarCompra(cliente1, tiempoinicial);
        cajera2.procesarCompra(cliente2, tiempoinicial);
    }
    
    private static void setProductos(List<Producto> productos) {
        Producto producto1 = new Producto("Mango", 1500, 6);
        Producto producto2 = new Producto("Cereal", 8200, 1);
        Producto producto3 = new Producto("Leche", 4000, 1);
        Producto producto4 = new Producto("Arepas", 1200, 3);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
    }
}

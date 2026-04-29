package com.generation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarritoTest {

    @Test
    void unCarritoRecienCreadoEstaVacio() {
        Carrito carrito = new Carrito();
        assertTrue(carrito.estaVacio());
    }

    @Test
    void despuesDeAgregarUnProductoLaCantidadEsUno() {
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Mouse", 100.0, 2);

        carrito.agregar(producto);

        assertEquals(1, carrito.cantidadDeProductos());
    }


    @Test
    void unCarritoConUnProductoNoEstaVacio() {
        Carrito carrito = new Carrito();
        Producto producto = new Producto("Mouse", 100.0, 2);

        carrito.agregar(producto);

        assertTrue(!carrito.estaVacio());
    }


}
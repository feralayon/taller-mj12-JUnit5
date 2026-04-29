package com.generation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarritoTest {

    @Test
    void unCarritoRecienCreadoEstaVacio() {
        Carrito carrito = new Carrito();
        assertTrue(carrito.estaVacio());
    }
}
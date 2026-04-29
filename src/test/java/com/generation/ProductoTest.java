package com.generation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {
    @Test
    void testConstructorYGetters() {
        // organizar
        Producto p = new Producto("Laptop", 1000.0, 5);
        // actuar ---> afirmar
        assertEquals("Laptop", p.getNombre());
        assertEquals(1000.0, p.getPrecio());
    }

    @Test
    void testExcepcionPrecioNegativo() {
        // Afirmar que lanza excepcion
        assertThrows(IllegalArgumentException.class, () -> new Producto("Error", -10.0, 5));
    }
}

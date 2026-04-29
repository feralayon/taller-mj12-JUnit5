package com.generation;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos = new ArrayList<>();

    public void agregar(Producto p) {
        productos.add(p);
    }

    public int cantidadDeProductos() {
        return productos.size();
    }

    public boolean estaVacio() {
        return productos.isEmpty();
    }
}
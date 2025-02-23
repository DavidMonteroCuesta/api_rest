package es.etg.dmc.acc.api_rest.service;

import java.util.ArrayList;
import java.util.List;

import es.etg.dmc.acc.api_rest.model.Producto;

public class ProductoService {

    private static final List<Producto> productos = new ArrayList<>();
    private static Long idCounter = 1L;

    public static void agregarProducto(String nombre, Double precio) {
        Producto nuevoProducto = new Producto(nombre, precio);
        nuevoProducto.setId(idCounter++);
        productos.add(nuevoProducto);
    }

    public static void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos.");
        } else {
            for (Producto producto : productos) {
                System.out.println("ID: " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
            }
        }
    }
}


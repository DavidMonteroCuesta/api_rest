package es.etg.dmc.acc.api_rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.etg.dmc.acc.api_rest.model.Producto;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final List<Producto> productos = new ArrayList<>();

    @PostMapping
    public Producto agregarProducto(@RequestBody Producto producto) {
        producto.setId((long) (productos.size() + 1));  // Simple auto-incremento
        productos.add(producto);
        return producto;
    }

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable Long id) {
        return productos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @GetMapping
    public List<Producto> obtenerProductos() {
        return productos;
    }

    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productos.removeIf(p -> p.getId().equals(id));
        return "Producto eliminado";
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        Producto existing = obtenerProducto(id);
        if (existing != null) {
            existing.setNombre(producto.getNombre());
            existing.setPrecio(producto.getPrecio());
            return existing;
        }
        return null;
    }
}

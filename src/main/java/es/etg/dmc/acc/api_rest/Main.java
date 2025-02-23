package es.etg.dmc.acc.api_rest;

import java.util.Scanner;

import es.etg.dmc.acc.api_rest.service.ProductoService;

// http://localhost:8080/productos
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("¿Qué te gustaría hacer?");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingresa el nombre del producto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingresa el precio del producto: ");
                    double precio = scanner.nextDouble();

                    ProductoService.agregarProducto(nombre, precio);
                    System.out.println("Producto agregado correctamente.\n");
                }

                case 2 -> ProductoService.mostrarProductos();

                case 3 -> {
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Opción inválida. Intenta de nuevo.\n");
            }
        }
    }
}

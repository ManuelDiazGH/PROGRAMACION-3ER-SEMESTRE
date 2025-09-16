import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Laptop", "Electrónica", 1200.00, 5),
                new Producto("Smartphone", "Electrónica", 800.00, 10),
                new Producto("Camiseta", "Ropa", 25.00, 50),
                new Producto("Zapatos", "Ropa", 150.00, 20),
                new Producto("Libro", "Educación", 30.00, 100),
                new Producto("Monitor", "Electrónica", 300.00, 15),
                new Producto("Silla", "Muebles", 85.00, 8),
                new Producto("Mesa", "Muebles", 200.00, 12)
        );

        System.out.println("Productos con precio mayor a 100, ordenados por precio descendente:");
        List<Producto> productosFiltrados = productos.stream()
                .filter(producto -> producto.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .collect(Collectors.toList());
        productosFiltrados.forEach(producto ->
                System.out.println(producto.getNombre() + " - " + producto.getPrecio())
        );

        System.out.println("\nStock total por categoría:");
        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)));
        stockPorCategoria.forEach((categoria, stockTotal) ->
                System.out.println(categoria + ": " + stockTotal)
        );

        String productosString = productos.stream()
                .map(producto -> producto.getNombre() + " - " + producto.getPrecio())
                .collect(Collectors.joining("; "));
        System.out.println("\nLista de productos (nombre y precio):");
        System.out.println(productosString);

        double precioPromedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);
        System.out.println("\nPrecio promedio general: " + precioPromedioGeneral);

        System.out.println("\nPrecio promedio por categoría:");
        Map<String, Double> precioPromedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)));
        precioPromedioPorCategoria.forEach((categoria, precioPromedio) ->
                System.out.println(categoria + ": " + precioPromedio)
        );
    }
}

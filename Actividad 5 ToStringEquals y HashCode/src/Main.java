import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        Producto producto1 = new Producto("001", "Primer producto", 10.0);
        Producto producto2 = new Producto("002", "Segunoo producto", 15.0);
        Producto producto3 = new Producto("003", "Tercer productoo", 18.0);
        Producto producto4 = new Producto("004", "Cuarto producto", 17.0);
        Producto producto5 = new Producto("002", "Quinto producto", 12.5);
        Producto producto6 = new Producto("002", "Sexto producto", 14.0);

        agregarProducto(productos, producto1);
        agregarProducto(productos, producto2);
        agregarProducto(productos, producto3);
        agregarProducto(productos, producto4);
        agregarProducto(productos, producto5);
        agregarProducto(productos, producto6);


        for (Producto producto : productos) {
            System.out.println("Código: " + producto.getCodigo() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }
    }
    public static void agregarProducto(Set<Producto> productos, Producto nuevoProducto) {
        if (productos.add(nuevoProducto)) {
            System.out.println("Producto añadido: " + nuevoProducto.getNombre());
        } else {
            System.out.println("El producto " + nuevoProducto.getNombre() + " ya existe en el conjunto.");
        }
    }
}

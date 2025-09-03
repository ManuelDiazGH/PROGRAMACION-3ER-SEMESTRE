import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        Producto productos1 = new Producto("001", "Primer Producto", 10.0);
        Producto productos2 = new Producto("002", "Segundo Producto", 15.0);
        Producto productos3 = new Producto("001", "Tercer productoo", 18.0);

        agregarProducto(productos, productos1);
        agregarProducto(productos, productos2);
        agregarProducto(productos, productos3);

        for (Producto producto : productos) {
            System.out.println("Codigo: " + producto.getCodigo() + " Nombre: " + producto.getNombre() + " precio: " + producto.getPrecio());
        }
    }

    private static void agregarProducto(List<Producto> productos, Producto NuevoProducto) {
        if (!productos.contains(NuevoProducto)) {
            productos.add(NuevoProducto);
            System.out.println("se ha agregado el: " + NuevoProducto.getNombre());
        }
        else {
            System.out.println("el producto: " + NuevoProducto.getNombre() + " ya esta en la lista");

        }
    }
}
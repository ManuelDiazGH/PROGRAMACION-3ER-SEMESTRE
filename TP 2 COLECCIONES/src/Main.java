import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet<Producto> productos = new HashSet<>();

        productos.add(new Producto("001", "electrodomestico"));
        productos.add(new Producto("002", "belleza"));
        productos.add(new Producto("001", "herramientas"));
        productos.add(new Producto("003","alimento"));
        productos.add(new Producto("004", "electrodomesticos"));

        for (Producto producto : productos){
            System.out.println(producto);
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("001", "auto de juguete", 2000, "matel");
        Producto p2 = new Producto("002", "camion de construccion", 3000, "lego");

        ProductoDTO dto1 = new ProductoDTO();
        dto1.setCodigo("001");
        dto1.setNombre("pelota");
        dto1.setPrecio(500);

        ProductoDTO dto2 = new ProductoDTO();
        dto2.setCodigo("002");
        dto2.setNombre("espada de juguete");
        dto2.setPrecio(700);

        List<ProductoDTO> Listadto = new ArrayList<>();
        Listadto.add(dto1);
        Listadto.add(dto2);

        System.out.println("Lista de ProductoDTO: ");
        for (ProductoDTO dto : Listadto) {
            System.out.println(dto);
        }
    }
}

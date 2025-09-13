import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("001", "fibra optica", "movistar", 200);
        Producto p2 = new Producto("002", "fibra optica", "claro", 300);

        ProductoRecord Rec1 = new ProductoRecord("001", "Wifi 6", 400);
        ProductoRecord Rec2 = new ProductoRecord("002", "wifi 6", 500);

        ProductoRecord Rec3 = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord Rec4 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());

        List<ProductoRecord> Listarec = new ArrayList<>();
        Listarec.add(Rec1);
        Listarec.add(Rec2);
        Listarec.add(Rec3);
        Listarec.add(Rec4);

        System.out.println("Lista de ProductoRecord: ");
        for (ProductoRecord i : Listarec) {
            System.out.println(i);
        }
    }
    }
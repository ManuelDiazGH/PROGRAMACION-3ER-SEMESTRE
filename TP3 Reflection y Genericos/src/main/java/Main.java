import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Caja<String> cajaString = new Caja<>();
        cajaString.almacenar("Hola, mundo!");
        System.out.println("Contenido de cajaString: " + cajaString.obtener());


        Caja<Integer> cajaInteger = new Caja<>();
        cajaInteger.almacenar(123);
        System.out.println("Contenido de cajaInteger: " + cajaInteger.obtener());


        List listaSinGenericos = new ArrayList();
        listaSinGenericos.add("Texto");
        listaSinGenericos.add(456);


        for (Object obj : listaSinGenericos) {
            System.out.println("Contenido de listaSinGenericos: " + obj);
        }
    }
}

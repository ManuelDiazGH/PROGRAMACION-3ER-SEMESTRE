import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);
        listaEnteros.add(4);
        listaEnteros.add(5);

        System.out.println("Lista de enteros:");
        imprimirLista(listaEnteros);

        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Hola");
        listaCadenas.add("Mundo");
        listaCadenas.add("Java");
        listaCadenas.add("Genericos");

        System.out.println("\nLista de cadenas:");
        imprimirLista(listaCadenas);
    }
}

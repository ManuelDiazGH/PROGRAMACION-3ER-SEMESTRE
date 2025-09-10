package tp_lombok_1;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("pedro");
        persona1.setEdad(19);

        Persona persona2 = new Persona("Marcos", 20);

        System.out.println("la persona 1 se llama: " + persona1.getNombre() + " y la edad es: " + persona1.getEdad());
        System.out.println("la persona 2 se llama: " + persona2.getNombre() + " y la edad es: " + persona2.getEdad());
    }
}
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String saludar() {
        return "Hola, soy " + nombre + " y tengo " + edad + " años.";
    }
}

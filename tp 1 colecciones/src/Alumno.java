public class Alumno {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "el nombre es: " + nombre + " y la nota es: " + nota;
    }
}

import java.util.ArrayList;
public class Curso {
    private String nombre;
    private String profesor;
    private ArrayList<Estudiante> listaDeEstudiantes;

    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.listaDeEstudiantes = new ArrayList<>();
    }

    public void INSERTOESTUDIANTES(Estudiante estudiante) {
        listaDeEstudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Profe: " + profesor + " cantidad de alumnos: " + listaDeEstudiantes.size();
    }
}



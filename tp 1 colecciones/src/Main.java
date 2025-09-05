import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("pepe", 8.50));
        alumnos.add(new Alumno("marcos", 9));
        alumnos.add(new Alumno("juan", 7.80));
        alumnos.add(new Alumno("maria", 8));

        for (Alumno alumno : alumnos){
            System.out.println(alumno);
        }
    }
}
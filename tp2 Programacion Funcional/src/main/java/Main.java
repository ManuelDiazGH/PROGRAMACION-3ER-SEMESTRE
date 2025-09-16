import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Juan", 8.5, "Matemáticas"),
                new Alumno("Ana", 6.0, "Física"),
                new Alumno("Pedro", 9.0, "Matemáticas"),
                new Alumno("Maria", 7.5, "Física"),
                new Alumno("Luis", 5.5, "Historia"),
                new Alumno("Laura", 8.0, "Historia"),
                new Alumno("Javier", 7.0, "Matemáticas"),
                new Alumno("Lucía", 9.5, "Física")
        );

        System.out.println("Alumnos aprobados (en mayúsculas y ordenados):");
        List<String> aprobados = alumnos.stream()
                .filter(alumno -> alumno.getNota() >= 7)
                .map(alumno -> alumno.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(aprobados);

        double promedioGeneral = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0.0);
        System.out.println("Promedio general de notas: " + promedioGeneral);

        System.out.println("Alumnos agrupados por curso:");
        Map<String, List<Alumno>> alumnosPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));
        alumnosPorCurso.forEach((curso, listaAlumnos) -> {
            System.out.println(curso + ": " + listaAlumnos.stream().map(Alumno::getNombre).collect(Collectors.toList()));
        });

        System.out.println("Los 3 mejores promedios:");
        List<Alumno> mejoresPromedios = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .collect(Collectors.toList());
        mejoresPromedios.forEach(alumno -> System.out.println(alumno.getNombre() + " con nota: " + alumno.getNota()));
    }
}

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("marcos", 18);
        Estudiante estudiante2 = new Estudiante("Joaquin", 19);
        Estudiante estudiante3 = new Estudiante("Jose", 18);
        Estudiante estudiante4 = new Estudiante("Lucas", 20);
        Estudiante estudiante5 = new Estudiante("Pepe", 18);


        Curso curso = new Curso("Estructuras de datos", "Carlos Ruiz");

        curso.INSERTOESTUDIANTES(estudiante1);
        curso.INSERTOESTUDIANTES(estudiante2);
        curso.INSERTOESTUDIANTES(estudiante3);
        curso.INSERTOESTUDIANTES(estudiante4);
        curso.INSERTOESTUDIANTES(estudiante5);

        System.out.println(curso);
    }
}
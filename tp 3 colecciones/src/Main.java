import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Curso> curso = new HashMap<>();

        curso.put("1234", new Curso("base de datos", "mario"));
        curso.put("2345", new Curso("programacion", "pedro"));
        curso.put("3456", new Curso("ingles","lucas"));

        String codigoCurso = "2345";
        Curso cursoRecuperado = curso.get(codigoCurso);
        if (cursoRecuperado != null) {
            System.out.println("Curso recuperado: " + cursoRecuperado);
        } else {
            System.out.println("No se encontró el curso con código: " + codigoCurso);
        }

        for (Map.Entry<String, Curso> entry : curso.entrySet()) {
            System.out.println("Código: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
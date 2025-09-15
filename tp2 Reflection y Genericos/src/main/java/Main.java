import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.AccessibleObject;


public class Main {
    public static void main(String[] args) {
        try {
            Class<?> personaClass = Class.forName("Persona");

            Constructor<?>[] constructores = personaClass.getDeclaredConstructors();
            System.out.println("Constructores de la clase Persona:");
            for (Constructor<?> constructor : constructores) {
                System.out.println(constructor);
            }

            Constructor<?> constructor = personaClass.getDeclaredConstructor(String.class, int.class);
            Object persona = constructor.newInstance("Juan", 30);

            var campoNombre = personaClass.getDeclaredField("nombre");
            campoNombre.setAccessible(true);
            campoNombre.set(persona, "Carlos");

            Method saludarMethod = personaClass.getMethod("saludar");
            String saludo = (String) saludarMethod.invoke(persona);
            System.out.println(saludo);

            Method saludarPrivateMethod = personaClass.getDeclaredMethod("saludar");
            AccessibleObject.setAccessible(new AccessibleObject[]{saludarPrivateMethod}, true);

            String saludoPrivado = (String) saludarPrivateMethod.invoke(persona);
            System.out.println(saludoPrivado);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

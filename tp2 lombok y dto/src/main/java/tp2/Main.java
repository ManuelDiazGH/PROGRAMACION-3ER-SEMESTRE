package tp2;

@Data
@Builder
public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = Usuario.builder()
                .id(1L)
                .nombre("Juan Perez")
                .email("juanperez@gmail.com")
                .build();

        Usuario usuario2 = Usuario.builder()
                .id(2L)
                .nombre("María Lopez")
                .email("marialopez@gmail.com")
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
    }
}

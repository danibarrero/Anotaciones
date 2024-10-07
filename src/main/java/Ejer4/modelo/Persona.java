package Ejer4.modelo;

import lombok.*;

@Value // Define la clase como inmutable, generando getters y otros métodos.
@Builder // Permite construir instancias de la clase `Persona` utilizando el patrón builder.
@Data // Genera automáticamente getters, setters, equals, hashCode y toString.
@AllArgsConstructor // Genera un constructor que incluye todos los atributos como parámetros.


public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private String dni;

    // Verifica que el parámetro persona no es nulo
    public Persona nulo(@NonNull Persona persona) {
        return persona;
    }
}

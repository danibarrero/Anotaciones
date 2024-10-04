package Ejer4.Modelo;

import lombok.*;

@Value
@Builder
@Data
@AllArgsConstructor

public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private String dni;

    public Persona nulo(@NonNull Persona persona) {
        return persona;
    }
}

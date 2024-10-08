package Ejer1.anotaciones;

import java.lang.annotation.Repeatable;

@Repeatable(Empleados.class)

public @interface Empleado {
    String nombre();
    String apellidos();
    String dni();
    String direccion();
    int telefono();
    String clase();
    int codigoDespacho() default 0;
    int codigoTaller() default 0;
    String perfil() default "";
    String categoria() default "";
}

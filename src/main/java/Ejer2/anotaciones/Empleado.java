package Ejer2.anotaciones;

import java.lang.annotation.*;

@Repeatable(Empleados.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented

public @interface Empleado {
    String nombre();
    String apellido();
    String direccion();
    String dni();
    int telefono();
}

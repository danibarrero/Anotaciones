package Ejer2.anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented

public @interface Tecnico {
    Empleado[] empleado();
    Operario operario();
    String perfil();
}

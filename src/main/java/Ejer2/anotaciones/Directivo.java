package Ejer2.anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Directivos.class)

public @interface Directivo {
    Empleado[] empleado();
    int codigoDespacho();
}

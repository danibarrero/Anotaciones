package EjerInstituto.Anotaciones;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Estudiantes.class)
@Documented

public @interface Estudiante {
    String nombre();
    String fechaNacimiento();
    int curso();
    String direccion() default "";
}

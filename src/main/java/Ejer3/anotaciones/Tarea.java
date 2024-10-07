package Ejer3.anotaciones;

import java.lang.annotation.*;

@Repeatable(Tareas.class)

public @interface Tarea {
    String titulo();
    String descripcion();
    String dia();
    String hora();

}

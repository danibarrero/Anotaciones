package Ejer3.modelos;

import Ejer3.anotaciones.Tarea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorDeContexto {

    // Devuelve una lista de anotaciones de tipo Tarea
    public static List<Tarea> listaTarea() {
        return Arrays.asList(Ejer3.modelos.Agenda.class.getAnnotationsByType(Tarea.class));
    }

    // Carga las tareas de las anotaciones y crea instancias de la clase Tarea
    public static List<Ejer3.modelos.Tarea> cargarTarea() {

        // Recorre cada anotación de tipo Tarea obtenida de listaTarea
        List<Ejer3.modelos.Tarea> listaTareas = new ArrayList<>();
        for (Tarea tarea : listaTarea()) {
            // Crea una nueva instancia de Tarea con los valores de la anotación
            Ejer3.modelos.Tarea x = new Ejer3.modelos.Tarea(tarea.titulo(),
                                                            tarea.descripcion(),
                                                            tarea.dia(),
                                                            tarea.hora());
            listaTareas.add(x);
        }

        return listaTareas; // Añade la tarea a la lista de tareas
    }

}

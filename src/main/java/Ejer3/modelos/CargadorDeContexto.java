package Ejer3.modelos;

import Ejer3.anotaciones.Tarea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorDeContexto {

    public static List<Tarea> listaTarea() {
        return Arrays.asList(Ejer3.modelos.Agenda.class.getAnnotationsByType(Tarea.class));
    }

    public static List<Ejer3.modelos.Tarea> cargarTarea() {

        List<Ejer3.modelos.Tarea> listaTareas = new ArrayList<>();
        for (Tarea tarea : listaTarea()) {
            Ejer3.modelos.Tarea x = new Ejer3.modelos.Tarea(tarea.titulo(), tarea.descripcion(), tarea.dia(), tarea.hora());
            listaTareas.add(x);
        }

        return listaTareas;
    }


}

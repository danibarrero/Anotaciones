package Ejer3.modelos;

import Ejer3.anotaciones.Tarea;

import java.util.List;

@Tarea(
        titulo = "Diseño",
        descripcion = "Ejercicios HTML",
        dia = "11-11-2024",
        hora = "11:30"
)

@Tarea(
        titulo = "Programacion",
        descripcion = "Ejercicios de Java",
        dia = "12-12-2024",
        hora = "13:25"
)

public class Agenda {

    // Llama al método de Cargado De Tarea y lo imprime
    public static void main(String[] args) {
        System.out.println(CargadorDeContexto.cargarTarea());
    }

}

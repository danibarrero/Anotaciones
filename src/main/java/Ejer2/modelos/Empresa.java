package Ejer2.modelos;

import Ejer2.anotaciones.*;

import java.util.ArrayList;
import java.util.List;

@Directivo(
        empleado = @Empleado(
                nombre = "Amancio",
                apellido = "Ortega",
                dni = "66554433F",
                direccion = "AV.DIPUTACION S/N, P.I. SABON 15142, ARTEIXO, LA CORUÑA",
                telefono = 981185596
        ),
        codigoDespacho = 1
)

@Tecnico(
        empleado =  @Empleado(
                nombre = "Pedro",
                apellido = "Picapiedra",
                dni = "26798866D",
                direccion = "AV.DIPUTACION S/N, P.I. SABON 15142, ARTEIXO, LA CORUÑA",
                telefono = 952566884
        ),
        operario = @Operario(
                codigoTaller = 2
        ),
        perfil = "Profesional"
)

@Oficial(
        empleado = @Empleado(
                nombre = "Antonio",
                apellido = "Toledo",
                dni = "49615678S",
                direccion = "AV.DIPUTACION S/N, P.I. SABON 15142, ARTEIXO, LA CORUÑA",
                telefono = 981185596
        ),
        operario = @Operario(
                codigoTaller = 3
        ),
        categoria = "Basica"
)

public class Empresa {
        private List<Ejer1.modelos.Empleado> empleadoList = new ArrayList<>();
        private String nombre;

        public List<Ejer1.modelos.Empleado> getEmpleadoList() {
                return empleadoList;
        }

        public void setEmpleadoList(List<Ejer1.modelos.Empleado> empleadoList) {
                this.empleadoList = empleadoList;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        @Override
        public String toString() {
                return "Empresa{" +
                        ", nombre='" + nombre + '\'' +
                        "empleadoList=" + empleadoList +
                        '}';
        }
}
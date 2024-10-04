package Ejer1.modelos;

import Ejer1.anotaciones.Empleado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Empleado(
        nombre = "Amancio",
        apellidos = "Ortega",
        dni = "66554433F",
        direccion = "AV.DIPUTACION S/N, P.I. SABON 15142, ARTEIXO, LA CORUÑA",
        telefono = 981185596,
        clase = "Directivo",
        codigoDespacho = 1
)

@Empleado(
        nombre = "Pedro",
        apellidos = "Picapiedra",
        dni = "26798866D",
        direccion = "AV.DIPUTACION S/N, P.I. SABON 15142, ARTEIXO, LA CORUÑA",
        telefono = 952566884,
        clase = "Tecnico",
        codigoTaller = 2,
        perfil = "Profesional"
)

@Empleado(
        nombre = "Antonio",
        apellidos = "Toledo",
        dni = "49615678S",
        direccion = "AV.DIPUTACION S/N, P.I. SABON 15142, ARTEIXO, LA CORUÑA",
        telefono = 981185596,
        clase = "Oficial",
        codigoTaller = 3,
        categoria = "Basica"
)

public class Empresa {

    List<Ejer1.modelos.Empleado> empleados;

    public static Empresa cargadorDeContexto() {
        Empresa empresa = new Empresa();
        Empleado[] empleados = Empresa.class.getAnnotationsByType(Empleado.class);
        List<Ejer1.modelos.Empleado> empleadoList = new ArrayList<>();

        for (Empleado empleado : empleados) {
            if (empleado.clase().equals("Directivo")) {
                Directivo directivo = new Directivo();

                directivo.setNombre(empleado.nombre());
                directivo.setApellidos(empleado.apellidos());
                directivo.setDni(empleado.dni());
                directivo.setDireccion(empleado.direccion());
                directivo.setTelefono(Integer.toString(empleado.telefono()));
                directivo.setClase(empleado.clase());
                directivo.setCodigoDespacho(empleado.codigoDespacho());

                empleadoList.add(directivo);
            }

            if (empleado.clase().equals("Tecnico")) {
                Tecnico tecnico = new Tecnico();

                tecnico.setNombre(empleado.nombre());
                tecnico.setApellidos(empleado.apellidos());
                tecnico.setDni(empleado.dni());
                tecnico.setDireccion(empleado.direccion());
                tecnico.setTelefono(Integer.toString(empleado.telefono()));
                tecnico.setClase(empleado.clase());
                tecnico.setCodigoTaller(empleado.codigoTaller());
                tecnico.setPerfil(empleado.perfil());

                empleadoList.add(tecnico);
            }

            if (empleado.clase().equals("Oficial")) {
                Oficial oficial = new Oficial();

                oficial.setNombre(empleado.nombre());
                oficial.setApellidos(empleado.apellidos());
                oficial.setDni(empleado.dni());
                oficial.setDireccion(empleado.direccion());
                oficial.setTelefono(Integer.toString(empleado.telefono()));
                oficial.setClase(empleado.clase());
                oficial.setCodigoTaller(empleado.codigoTaller());
                oficial.setCategoria(empleado.categoria());

                empleadoList.add(oficial);
            }
        }

        empresa.setEmpleados(empleadoList);
        return empresa;
    }

    @Override
    public String toString() {
        return Arrays.toString(empleados.toArray());
    }

    public List<Ejer1.modelos.Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Ejer1.modelos.Empleado> empleados) {
        this.empleados = empleados;
    }

    public static void main(String[] args) {
        Empresa empresa = Empresa.cargadorDeContexto();
        System.out.println(empresa);
    }
}

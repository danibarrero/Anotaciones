package Ejer2.modelos;

import Ejer2.anotaciones.Directivo;
import Ejer2.anotaciones.Empleado;
import Ejer2.anotaciones.Oficial;
import Ejer2.anotaciones.Tecnico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorDeContexto {

    // Lista de anotaciones Directivo de la clase Empresa
    public static List<Directivo> listaDirectivos() {
        return Arrays.asList(Empresa.class.getAnnotationsByType(Directivo.class));
    }

    // Lista de anotaciones Tecnico de la clase Empresa
    public static List<Tecnico> listaTecnicos() {
        return Arrays.asList(Empresa.class.getAnnotationsByType(Tecnico.class));
    }

    // Lista de anotaciones Oficial de la clase Empresa
    public static List<Oficial> listaOficials() {
        return Arrays.asList(Empresa.class.getAnnotationsByType(Oficial.class));
    }

    // Cargar la lista de empleados de tipo Directivo
    public static List<Ejer1.modelos.Directivo> cargarDirectivos() {
        List<Ejer1.modelos.Directivo> listaDirectivos = new ArrayList<>();
        for (Directivo directivo : listaDirectivos()) {
            for (Empleado empleado : directivo.empleado()) {
                Ejer1.modelos.Directivo directivo1 = new Ejer1.modelos.Directivo();

                directivo1.setNombre(empleado.nombre());
                directivo1.setApellidos(empleado.apellido());
                directivo1.setDni(empleado.dni());
                directivo1.setDireccion(empleado.direccion());
                directivo1.setTelefono(Integer.toString(empleado.telefono()));
                directivo1.setCodigoDespacho(directivo.codigoDespacho());

                listaDirectivos.add(directivo1);
            }
        }

        return listaDirectivos;
    }

    // Cargar la lista de empleados de tipo Tecnico
    public static List<Ejer1.modelos.Tecnico> cargarTecnicos() {
        List<Ejer1.modelos.Tecnico> listaTecnicos = new ArrayList<>();
        for (Tecnico tecnico : listaTecnicos()) {
            for (Empleado empleado : tecnico.empleado()) {
                Ejer1.modelos.Tecnico tecnico1 = new Ejer1.modelos.Tecnico();

                tecnico1.setNombre(empleado.nombre());
                tecnico1.setApellidos(empleado.apellido());
                tecnico1.setDni(empleado.dni());
                tecnico1.setDireccion(empleado.direccion());
                tecnico1.setTelefono(Integer.toString(empleado.telefono()));
                tecnico1.setCodigoTaller(tecnico.operario().codigoTaller());
                tecnico1.setPerfil(tecnico.perfil());

                listaTecnicos.add(tecnico1);
            }
        }

        return listaTecnicos;
    }

    // Cargar la lista de empleados de tipo Oficial
    public static List<Ejer1.modelos.Oficial> cargarOficial() {
        List<Ejer1.modelos.Oficial> listaOficials = new ArrayList<>();
        for (Oficial oficial : listaOficials()) {
            for (Empleado empleado : oficial.empleado()) {
                Ejer1.modelos.Oficial oficial1 = new Ejer1.modelos.Oficial();

                oficial1.setNombre(empleado.nombre());
                oficial1.setApellidos(empleado.apellido());
                oficial1.setDni(empleado.dni());
                oficial1.setDireccion(empleado.direccion());
                oficial1.setTelefono(Integer.toString(empleado.telefono()));
                oficial1.setCodigoTaller(oficial.operario().codigoTaller());
                oficial1.setCategoria(oficial.categoria());

                listaOficials.add(oficial1);
            }
        }

        return listaOficials;
    }

    // Cargar una lista completa de empleados de todos los tipos
    public static List<Ejer1.modelos.Empleado> cargarEmpleado() {
        List<Ejer1.modelos.Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.addAll(cargarDirectivos());
        listaEmpleados.addAll(cargarTecnicos());
        listaEmpleados.addAll(cargarOficial());

        return listaEmpleados;
    }

    // Prueba de la carga de empleados
    public static void main(String[] args) {
//        System.out.println(cargarOficial());
//        System.out.println(cargarDirectivos());
//        System.out.println(cargarTecnicos());

        CargadorDeContexto cc = new CargadorDeContexto();

        Empresa empresa = new Empresa();
        empresa.setNombre("MLG");

        // Cargar la lista de empleados en la empresa
        empresa.setEmpleadoList(cc.cargarEmpleado());

        // Imprimir la información de la empresa con su lista de empleados
        System.out.println(empresa);
    }
}

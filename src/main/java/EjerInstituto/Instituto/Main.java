package EjerInstituto.Instituto;

import EjerInstituto.Anotaciones.Clase2DAW;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido al gestor de Instituto");
        System.out.println("Cargando contexto de aplicación");

        List<Clase2DAW> clases = CargadorContexto.cargaContextoInstituto();

        System.out.println("Clases cargadas");
        for (Clase2DAW clase : clases) {
            System.out.println(clase);
        }
    }
}

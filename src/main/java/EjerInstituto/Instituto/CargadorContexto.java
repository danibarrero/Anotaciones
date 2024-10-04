package EjerInstituto.Instituto;

import EjerInstituto.Anotaciones.Clase2DAW;
import EjerInstituto.Anotaciones.Estudiantes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CargadorContexto {

    public static List<Clase2DAW> cargaContextoInstituto() {

        Estudiantes[] estudiantesAnnotation = Clase.class.getAnnotationsByType(Estudiantes.class);

        Clase clase1 = new Clase("1", "1DAW");
        Clase clase2 = new Clase("2", "2DAW");

        Map<Integer, Clase> integerClassMap = new HashMap<>();

        for (Estudiantes Annotation : estudiantesAnnotation) {
            
        }

        return null;
    }
}

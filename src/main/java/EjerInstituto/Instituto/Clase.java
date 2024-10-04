package EjerInstituto.Instituto;

import EjerInstituto.Anotaciones.Estudiante;

import java.util.Objects;

@Estudiante(nombre = "Dani", fechaNacimiento = "11/03/2004", curso = 2)
public class Clase {
    private String curso;
    private String aula;

    public Clase(String curso, String aula) {
        this.curso = curso;
        this.aula = aula;
    }

    public Clase() {

    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clase clase = (Clase) o;
        return Objects.equals(curso, clase.curso) && Objects.equals(aula, clase.aula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curso, aula);
    }

    @Override
    public String toString() {
        return "Clase{" +
                "curso='" + curso + '\'' +
                ", aula='" + aula + '\'' +
                '}';
    }
}


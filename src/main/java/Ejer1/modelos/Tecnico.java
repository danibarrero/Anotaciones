package Ejer1.modelos;

public class Tecnico extends Operario {
    private String perfil;

    public Tecnico(String nombre, String apellidos, String dni, String direccion, String telefono, String clase, int codigoTaller, String perfil) {
        super(nombre, apellidos, dni, direccion, telefono, clase, codigoTaller);
        this.perfil = perfil;
    }

    public Tecnico() {
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "perfil='" + perfil + '\'' +
                '}'+ super.toString();
    }
}

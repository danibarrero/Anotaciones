package Ejer1.modelos;

public class Operario extends Empleado {

    private int codigoTaller;

    public Operario(String nombre, String apellidos, String dni, String direccion, String telefono, String clase, int codigoTaller) {
        super(nombre, apellidos, dni, direccion, telefono, clase);
        this.codigoTaller = codigoTaller;
    }

    public Operario() {
    }

    public int getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(int codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "codigoTaller=" + codigoTaller +
                '}' + super.toString();
    }
}

package Ejer1.modelos;

public class Directivo extends Empleado {

    private int codigoDespacho;

    public Directivo(String nombre, String apellidos, String dni, String direccion, String telefono, String clase, int codigoDespacho) {
        super(nombre, apellidos, dni, direccion, telefono, clase);
        this.codigoDespacho = codigoDespacho;
    }

    public Directivo() {
    }

    public int getCodigoDespacho() {
        return codigoDespacho;
    }

    public void setCodigoDespacho(int codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "codigoDespacho=" + codigoDespacho +
                '}' + super.toString();
    }
}

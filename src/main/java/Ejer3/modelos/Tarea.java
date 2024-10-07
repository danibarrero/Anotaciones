package Ejer3.modelos;

public class Tarea {
    private String titulo;
    private String descripcion;
    private String dia;
    private String hora;

    public Tarea(String nombre, String descripcion, String dia, String hora) {
        this.titulo = nombre;
        this.descripcion = descripcion;
        this.dia = dia;
        this.hora = hora;
    }

    public Tarea() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                '}' + "\n";
    }
}

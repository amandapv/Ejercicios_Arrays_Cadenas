package Ej_Arrays_Entregables;

public class notas_alumnos_01 {
    private String nombre;
    private int nota;

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public notas_alumnos_01(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String toString() {
        return this.nombre + " " + this.nota;
    }
}

package Arrays_Objetos;

public class Ejer_04_Concesionario {

    //variables
    public String marca, modelo, tipo_motor;
    public double precio_base;
    public boolean aire_acond, cierre_central, pintura_metalizada;

    //método constructor de la clase Ejer_04_Concesionario
    public Ejer_04_Concesionario(String marca, String modelo, String tipo_motor, double precio_base, boolean aire_acond, boolean cierre_central, boolean pintura_metalizada) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo_motor = tipo_motor;
        this.precio_base = precio_base;
        this.aire_acond = aire_acond;
        this.cierre_central = cierre_central;
        this.pintura_metalizada = pintura_metalizada;
    }

    public void mostrar_coche() {
        System.out.println("Marca: " + marca + ", modelo: " + modelo + ", tipo de motor: " + tipo_motor + ", precio base: " + precio_base + ", ¿tiene aire acondicionado? " + aire_acond + ", ¿tiene cierre central? " + cierre_central + ", ¿tiene pintura metalizada? " + pintura_metalizada);
    }

}
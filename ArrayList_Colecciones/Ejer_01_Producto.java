package ArrayList_Colecciones;

public class Ejer_01_Producto {
    public String nombre;

    public float PrecioVigo;

    public float PrecioSantiago;

    public float PrecioMadrid;


    //contructor de la clase Ejer_01_Producto
    public Ejer_01_Producto(String nombre, float precioVigo, float precioSantiago, float precioMadrid) {
        this.nombre = nombre;
        this.PrecioVigo = precioVigo;
        this.PrecioSantiago = precioSantiago;
        this.PrecioMadrid = precioMadrid;
    }


    //método para visualizar los productos
    public void mostrar_producto() {
        System.out.println("Datos de los productos:");
        System.out.println("Nombre del producto: " + nombre + ". El precio en Vigo es de: " + PrecioVigo + ", el precio en Santiago es de: " + PrecioSantiago + " y el precio en Madrid es de: " + PrecioMadrid);
    }


    //método get para el precio del producto de Vigo
    public float getPrecioVigo() {

        return PrecioVigo;
    }


    //método get para el precio del producto de Santiago
    public float getPrecioSantiago() {
        return PrecioSantiago;
    }


    //método get para el precio del producto de Madrid
    public float getPrecioMadrid() {
        return PrecioMadrid;
    }



}

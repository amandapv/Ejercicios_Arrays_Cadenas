package ArrayList_Colecciones;

import Arrays_Objetos.Ejer_04_Concesionario;

import java.util.ArrayList;

public class Ejer_01_Operaciones {

    public static void suma_productos_vigo(ArrayList <Ejer_01_Producto> arraylist_producto) {
        float suma_total_Vigo = 0;
        int cont_sumas_Vigo = 0;

        for (Ejer_01_Producto prd_suma_vigo:arraylist_producto) {
            suma_total_Vigo = suma_total_Vigo + prd_suma_vigo.PrecioVigo;
            cont_sumas_Vigo++;
        }
        float media_suma_vigo = suma_total_Vigo / cont_sumas_Vigo;

        System.out.println("Suma de productos en Vigo: " + suma_total_Vigo);
        System.out.println("Media del precio en Vigo: " + media_suma_vigo);
    }

}

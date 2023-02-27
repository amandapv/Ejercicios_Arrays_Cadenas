/*
Realizar un programa que cree una colección dinámica de tipo ArrayList, de objetos de la clase Producto y realice los métodos:
                        MENÚ

 1_Añadir objetos a la colección usando un bucle adecuado.

 2_Listar los productos almacenados.

 3_Sumar filas (Media de cada precio producto en las tres ciudades).

 4_Clasificar por productos/ordenación. ascendente/descendente

 5_Buscar un producto(dicotómica).

 6_Salir.

Clase Producto

String nombre

float PrecioVigo

float PrecioSantiago

float PrecioMadrid


Constructor con y sin parámetros.

Métodos get() y set().

 */

package ArrayList_Colecciones;

import Arrays_Objetos.Ejer_04_Concesionario;
import Arrays_Objetos.Ejer_04_Operaciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer_01_Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int menu;
        int num_prod = 0;
        boolean noSalir = true;

        //crear un ArrayList
        ArrayList <Ejer_01_Producto> arraylist_producto = new ArrayList <Ejer_01_Producto> ();

        //crear un objecto de la clase Ejer_01_Producto llamado productos
        Ejer_01_Producto obj_productos = new Ejer_01_Producto("Pd" + (5*3), 50 *3, 35 *3, 70*2);


        while (noSalir) {
            System.out.println("Elige una opción para el menú. 1 - Añadir productos, 2 - Mostrar productos, 3 - Sumar filas, 4 - Clasificar productos, 5 - Buscar producto , 6 - Salir");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    //pedir al usuario cuantos productos quiere añadir
                    System.out.println("¿Cuántos coches vas a querer meter? ");
                    num_prod = teclado.nextInt();

                    for (int i=0; i<num_prod; i++) {
                        arraylist_producto.add(obj_productos);  //añadir el objeto al ArrayList llamado arraylist_producto
                    }
                    break;
                case 2:
                    for (Ejer_01_Producto producto:arraylist_producto) {
                        producto.mostrar_producto();
                    }
                    break;
                case 3:
                   /* float suma_total_Vigo = 0;
                    int cont_sumas_Vigo = 0;
                    for (int i=0; i<obj_productos.lenght; i++) {
                        suma_total = suma_total + obj_productos[i].PrecioVigo;

                    }
                    /*for (Ejer_01_Producto prd_suma_vigo:arraylist_producto) {
                        suma_total_Vigo = suma_total_Vigo + prd_suma_vigo.PrecioVigo;
                        cont_sumas_Vigo++;
                    }
                    float media_suma_vigo = suma_total_Vigo / cont_sumas_Vigo;

                    System.out.println("Suma de productos en Vigo: " + suma_total_Vigo);
                    System.out.println("Media del precio en Vigo: " + media_suma_vigo);*/
                    Ejer_01_Operaciones.suma_productos_vigo(arraylist_producto);
                    break;
                case 4:
                    break;
                case 6:
                    System.out.println("Adiós");
                    noSalir = false;
                    break;

            }
        }

    }

}
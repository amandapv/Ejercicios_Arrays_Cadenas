/*
4. Crear un array de objetos coche para simular un Concesionario. Se debe guardar del coche la siguiente info: marca,
    modelo,precio_base,aire_acondicionado,cierre_central,pintura_metalizada, tipo_motor.
La aplicación a desarrollar deberá tener el siguiente menú:
        case 1:
            Carga.carga(coche);
        //Listado ordenado
        case 2:
            Ordenar.MayorMenorBurbuja(coche);//uso método burbuja para ordenar por Marca
            Ver.verArray(coche);
        //Coche más caro
        case 3:
           Ordenar.MayorPrecio(coche);//ordenación secuencial por precio_base encontrando el de precio base más alto
        //Busqueda
        case 4:
           Buscar.buscaDicotomica(coche);//búsqueda binaria o dicotómica
        case 5:
            Ver.verArray(coche);
        //Salir
        case 0:
        //Error
        default:
            System.out.println("Opción no válida");
 */

package Arrays_Objetos;

import java.util.Scanner;

public class Ejer_04_Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int menu;
        int coches;
        boolean noSalir = true;
        Ejer_04_Concesionario concesionario[] = new Ejer_04_Concesionario[0];

        while (noSalir) {

            System.out.println("Elige una opción para el menú. 0 - Salir, 1 - Añadir coche, 2 - Listado ordenado, 3 - Coche más caro, 4 - Busqueda, 5 - Búsqueda binaria o dicotómica");
            menu = teclado.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.println("¿Cuántos coches quieres meter?");
                    coches = teclado.nextInt();

                    //declarar el array
                    concesionario = new Ejer_04_Concesionario[coches];

                    //bucle que instancia el número de objetos de la clase Ejer_02_empleado que ha introducido el usuario
                    for (int i=0; i<concesionario.length; i++) {
                        concesionario[i] = new Ejer_04_Concesionario("citroen "+i, "saxo "+i, "electrico"+i, 500+i, true, false, false);
                    }
                    break;

                case 2:
                    //uso método burbuja para ordenar por Marca

                    for (int i=0; i<concesionario.length-1; i++) {

                    }
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    //Visualización del contenido del array empleado con forEach usando el método mostrar_coche()
                    for (Ejer_04_Concesionario coche:concesionario) {

                        coche.mostrar_coche();
                    }
                    break;

                case 0:
                    System.out.println("Adiós");
                    noSalir = false;
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }



    }
}
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

        Ejer_04_Concesionario concesionario[]; //se crea un array de objeto de tipo Ejer_04_Concesionario

        //pedir al usuario cuantos coches quiere añadir
        System.out.println("¿Cuántos coches vas a querer meter?. A continuación pulsa 1 para añadir esa cantidad de coches");
        coches = teclado.nextInt();

        //declarar el array
        concesionario = new Ejer_04_Concesionario[coches];

        while (noSalir) {

            System.out.println("Elige una opción para el menú. 0- Salir, 1- Añadir coche, 2- Ordenar coches por Marca, 3- Ver precio del coche más caro, 4- Busqueda binaria, 5- Mostrar coches");
            menu = teclado.nextInt();
            
            switch (menu) {
                case 1:
                    //rellenar coche
                    Ejer_04_Operaciones.rellenar_array_coche(concesionario);
                    break;

                case 2:
                    //uso método burbuja para ordenar por Marca
                    //Ejer_04_Operaciones.burbujaPorPrecio(concesionario); //este método es para ordenador por precio, lo hice para practicar
                    Ejer_04_Operaciones.burbujaPorMarca(concesionario);
                    break;

                case 3:
                    //uso método burbuja para ordenar los precios de mayor a menor y después en una varible guardar la posición 0 del objeto concesionario de la propiedad precio base, que tras haberlo ordenado, tendrá el precio máximo (posición 0)
                    Ejer_04_Operaciones.busq_secuencial_burbuja(concesionario);

                    break;

                case 4:
                    Ejer_04_Operaciones.burbujaPorMarca(concesionario); //previamente ordenarlo antes de realizar la búsqueda
                    Ejer_04_Operaciones.busq_binaria(concesionario, "citroen497"); //elegir la marca a buscar
                    break;

                case 5:
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
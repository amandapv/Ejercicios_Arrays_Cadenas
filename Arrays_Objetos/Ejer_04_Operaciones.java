package Arrays_Objetos;

import java.util.Arrays;

public class Ejer_04_Operaciones {

    //Añadir un coche
    public static void rellenar_array_coche(Ejer_04_Concesionario concesionario[]) {
        //bucle que instancia el número de objetos de la clase Ejer_02_empleado que ha introducido el usuario
        for (int i=0; i<concesionario.length; i++) {
            concesionario[i] = new Ejer_04_Concesionario("citroen"+(500-i), "saxo "+i, "electrico"+i, 500-i, true, false, false);
        }
    }


    //Uso método burbuja para ordenar por precio base - es solo para practicar
    public static void burbujaPorPrecio (Ejer_04_Concesionario concesionario[]){

        boolean burbuja_terminado = false;

        while (!burbuja_terminado) { //Recorrer el array por precio (double) para hacer una prueba con el método burbuja antes de ponerme a ordenar por marca (string), hasta que estén todos ordenados

            int contReordenaciones = 0;  //Declarar e inicializar la variable para que empiece a contar de nuevo cuando acabe el bucle

            for (int i=0;  i<concesionario.length-1; i++) {

                if (concesionario[i].precio_base > concesionario[i + 1].precio_base) {
                    Ejer_04_Concesionario aux; //Declarar una variable (aux) del tipo de la clase (Ejer_04_Concesionario)

                    //Intercambiar valores
                    aux = concesionario[i];
                    concesionario[i] = concesionario[i + 1];
                    concesionario[i + 1] = aux;

                    contReordenaciones++; //Indicar que hay un cambio
                }
            }

            if (contReordenaciones == 0) { //Si no hay intercambios, es que esta ordenado.
                burbuja_terminado = true;
            }
        }
    }


    //Uso método burbuja para ordenar por Marca
    public static void burbujaPorMarca (Ejer_04_Concesionario concesionario[]){

        boolean burbuja_terminado = false;

        while (!burbuja_terminado) {

            int contReordenaciones = 0; //Declarar e inicializar la variable para que empiece a contar de nuevo cuando acabe el bucle

            for (int i=0; i<concesionario.length-1; i++) {

                if (concesionario[i].marca.compareToIgnoreCase(concesionario[i + 1].marca) > 0) {
                    Ejer_04_Concesionario aux; //Declarar una variable (aux) del tipo de la clase (Ejer_04_Concesionario)

                    //Intercambiar valores
                    aux = concesionario[i];
                    concesionario[i] = concesionario[i + 1];
                    concesionario[i + 1] = aux;

                    contReordenaciones++; //Indicar que hay un cambio
                }
            }

            if (contReordenaciones == 0) { //Si no hay intercambios, es que esta ordenado.
                burbuja_terminado = true;
            }
        }
    }

    /* //No consigo hacer el caso 3 (búsqueda secuencial)
    public static void busq_secuencial(Ejer_04_Concesionario concesionario[]) {
        Ejer_04_Concesionario mayor;

        int minimo = Integer.MAX_VALUE;

        for (int i=0; i<concesionario.length; i++) {


            mayor=concesionario[0];


            if (mayor > concesionario[i].precio_base) {
                System.out.println("Soy el mayor");
            }

        }
    } */


    //uso método burbuja para ordenar los precios de mayor a menor y después en una varible guardar la posición 0 del objeto concesionario de la propiedad precio base, que tras haberlo ordenado, tendrá el precio máximo (posición 0)
    public static void busq_secuencial_burbuja(Ejer_04_Concesionario concesionario[]) {
        boolean burbuja_terminado = false;

        while (!burbuja_terminado) { //Recorrer el array por precio (double) hasta que estén todos ordenados

            int contReordenaciones = 0;  //Declarar e inicializar la variable para que empiece a contar de nuevo cuando acabe el bucle

            for (int i=0;  i<concesionario.length-1; i++) {

                if (concesionario[i].precio_base < concesionario[i + 1].precio_base) {
                    Ejer_04_Concesionario aux; //Declarar una variable (aux) del tipo de la clase (Ejer_04_Concesionario)

                    //Intercambiar valores
                    aux = concesionario[i];
                    concesionario[i] = concesionario[i + 1];
                    concesionario[i + 1] = aux;

                    contReordenaciones++; //Indicar que hay un cambio

                }
            }

            if (contReordenaciones == 0) { //Si no hay intercambios, es que esta ordenado.
                burbuja_terminado = true;
            }

        }

        //almacenar en la variablef "maximo" el precio base mayor de todos los objetos de tipo concesionario
        double maximo = concesionario[0].precio_base;

        System.out.println("El precio base máximo, entre todos los coches que hay, es de: " + maximo);
    }


    //Uso método búsqueda Binaria/Dicotómica para buscar por Precio
    public static void busq_binaria(Ejer_04_Concesionario concesionario[], String marca_a_buscar) { // le paso por parámetro la marca a buscar, y al llmar a este método, le digo la marca que quiero que busque

        int principio=0, mitad, finall=concesionario.length-1; //principio es la primera posición del array y final la última posición del array. Mitad es la posición del array que está en la mitad entre el primero y último

        //System.out.println("compareToIgnoreCase " + marca_a_buscar.compareToIgnoreCase(concesionario[3].marca));

        while (principio <= finall) {

            mitad = (principio + finall) / 2 ; //obtener la mitad del array si el principio es menor que el final

            //Primero nos posicionamos en la mitad del array, y evaluar el  número que está en esa posición. Si la cosa que estamos buscando es menor o mayor a esta posición, nos iremos a la parte derecha o izquierda y realizaremos de nuevo la búsqueda en la mitad, así hasta encontrar a la cosa que buscamos en el array.


            //version google
            if (marca_a_buscar.compareToIgnoreCase(concesionario[mitad].marca) == 0) {

                System.out.println("La marca buscada está en la posición " + mitad);

                break;

            } else if (marca_a_buscar.compareToIgnoreCase(concesionario[mitad].marca) < 0) { //menor que 0 para saber si es negativo, es decir, si es menor de la mitad

                finall = mitad - 1;

            } else {

                principio = mitad + 1;
            }


        }
    }
}
package Arrays_Objetos;

public class Ejer_04_Operaciones {

    //Uso método burbuja para ordenar por precio base - es solo para practicar
    public void burbujaPorPrecio (Ejer_04_Concesionario concesionario[]){

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

}

package Arrays_UnidimensionalesVectores;

import java.util.Scanner;

public class Ejer_1_Metodo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double [] num = new double[10];

        //para poder instanciar los métodos. Esto pasa por no tener el método como static
        Ejer_1_Metodo ej1 = new Ejer_1_Metodo(); //Instanciamos un objeto

        ej1.array_recorrer(num, teclado); //Ahora llamamos a ese objeto "ej1" para poder llamar al método NO estático array_recorrer. Le pasamos los parámetros necesarios, en este caso el nombre del array y "teclado" para no volver a llamar al Scanner en el método.
        ej1.array_leer(num); //Llamamos al objeto "ej1" para poder llamar al método NO estático "array_leer". Le pasamos el parámetro necesario, en este caso el nombre del array.

        //Ejer_1_Metodo.array_recorrer(num, teclado); //Esta forma sería si el método que llamamos fuera estático.
    }


    public void array_recorrer (double num[], Scanner teclado) {

        System.out.println("Dime 10 números");

        //bucle parar recorrer el array y pedir los valores
        for (int i=0; i<num.length; i++) {

            System.out.println("Dame el valor " + i + ": ");

            num[i] = teclado.nextDouble();

        }
    }


    public void array_leer (double num1[]) {
        for (double numeros:num1) {

            System.out.print(numeros + " ");

        }
    }
}
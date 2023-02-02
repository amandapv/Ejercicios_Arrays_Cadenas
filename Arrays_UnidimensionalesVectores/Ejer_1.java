//1. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores.

package Arrays_UnidimensionalesVectores;

import java.util.Scanner;

public class Ejer_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double [] num = new double[10];

        System.out.println("Te pediré 10 números");

        //bucle parar recorrer el array y pedir los valores
        for (int i=0; i<num.length; i++) {

            System.out.println("Dame el valor " + i + ": ");

            num[i] = teclado.nextDouble();
        }


        //bucle for each (o bucle for simplificado) para leer lo que hay en un array
        for (double numeros:num) {

            System.out.print(numeros + " ");

        }

    }
}
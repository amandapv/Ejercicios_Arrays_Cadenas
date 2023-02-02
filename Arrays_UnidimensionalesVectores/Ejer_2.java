//2. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre la suma de todos los valores.

package Arrays_UnidimensionalesVectores;

import java.util.Scanner;

public class Ejer_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double suma = 0;
        double [] num = new double[10];

        System.out.println("Te pediré 10 números y mostraré la suma de todos los valores");

        //bucle parar recorrer el array y pedir los valores
        for (int i=0; i<num.length; i++) {

            System.out.println("Dame el valor " + i + ": ");

            num[i] = teclado.nextDouble();

            suma = suma + num[i];
        }

        System.out.print(suma);
    }
}
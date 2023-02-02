/*
17.Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array y los 10 últimos en
 otro array. Por último, comparará ambos arrays y le dirá al usuario si son iguales o no.
 */

package Arrays_Avanzados_Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] array1 = new int [10];
        int [] array2 = new int [10];

        System.out.println("Dime 20 valores");

        //Pedir al usuario 10 valores e introducirlos en el primer array
        for (int i=0; i<array1.length; i++) {

            array1[i] = teclado.nextInt();

        }


        //Pedir al usuario 10 valores e introducirlos en el segundo array
        for (int i=0; i<array2.length; i++) {

            array2[i] = teclado.nextInt();

        }


        //Comparar con la clase arrays.equals si ambos arrays son iguales
        if ( Arrays.equals(array1, array2)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }

    }
}
//4. Crea un programa que pida veinte números enteros por teclado, los almacene en un array y luego muestre por separado
// la suma de todos los valores positivos y negativos.

package Arrays_UnidimensionalesVectores;

import java.util.Scanner;

public class Ejer_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] num = new int[20];
        int positivos = 0;
        int negativos = 0;

        System.out.println("Te pediré 20 números");

        //bucle parar recorrer el array y pedir los valores
        for (int i=0; i< num.length; i++) {

            System.out.println("Dame el valor " + i + ": ");

            num[i] = teclado.nextInt();

            if (num[i] < 0) {
                negativos += num[i];
            }
            if (num[i] > 0) {
                positivos = positivos + num[i];
            }
        }

        System.out.println("Total de números positivos " + positivos + ". Total de números negativos " + negativos);

    }
}
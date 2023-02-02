//7. Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga todos los valores desde P hasta Q,
// y lo muestre por pantalla.

package Arrays_UnidimensionalesVectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer_7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int P, Q;

        System.out.println("Valor inicial P: ");
        P = teclado.nextInt();

        System.out.println("Valor final Q: ");
        Q = teclado.nextInt();

        int num[] = new int[Q - P + 1];

        for(int i = 0; i<num.length; i++) //esta parte no me queda muy clara
        {
            num[i] = P + i;
        }

        for (int numeros:num) {
            System.out.print(numeros + " ");

        }

    }
}
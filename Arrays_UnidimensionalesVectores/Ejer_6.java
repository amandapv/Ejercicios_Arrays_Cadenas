//6. Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N, escriba M en todas sus posiciones
// y lo muestre por pantalla.

package Arrays_UnidimensionalesVectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N, M;

        System.out.println("Dime un número N");
        N = teclado.nextInt();

        System.out.println("Dime un número M");
        M = teclado.nextInt();

        //Creamos el array e inserta m en todas sus posiciones
        int [] num = new int[N];


        for (int i=0; i<num.length; i++ ) {
            num[i] = M;
        }

        for (int numeros:num) {
            System.out.print(numeros + " ");

        }
    }
}
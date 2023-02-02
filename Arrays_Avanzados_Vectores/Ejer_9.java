//9. Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10.
// Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.

package Arrays_Avanzados_Vectores;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejer_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] num = new int [100];
        int N;

        System.out.println("Dime un número del 1 al 10: ");
        N = teclado.nextInt();

        for (int i=0; i<num.length; i++) {

            num[i]= (int) (Math.random()*10+1);

            if (N == num[i]) {
                System.out.println("El número " + N + " aparece en la posición " + i);
            }
        }
    }
}
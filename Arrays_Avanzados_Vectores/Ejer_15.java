//15.Crea un programa que pida al usuario dos valores N y M y luego cree un array de tamaño N que contenga M en todas
// sus posiciones. Luego muestra el array por pantalla.

package Arrays_Avanzados_Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N, M;

        System.out.println("Dime el tamaño del array");
        N = teclado.nextInt();
        System.out.println("Dime el número que se repetirá N veces en el array");
        M = teclado.nextInt();

        int [] num = new int [N];

        Arrays.fill(num, M); //permite rellenar un array con un determinado valor.

        System.out.println(Arrays.toString(num)); //toString: permite visualizar el contenido de todo el array.
    }
}

/*
16.Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4,
 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla. En esta ocasión has de utilizar
  Arrays.fill().
 */

package Arrays_Avanzados_Vectores;

import java.util.Arrays;

public class Ejer_16 {
    public static void main(String[] args) {
        int [] num = new int [55];
        int cont=0;
        int suma =0;

        for (int i=0; i<10; i++) {
            num[i] = i + 1;
            cont++;

            System.out.println( num[i]+ " ");
            Arrays.fill(num, cont);
            System.out.println(Arrays.toString(num));
        }
    }
}

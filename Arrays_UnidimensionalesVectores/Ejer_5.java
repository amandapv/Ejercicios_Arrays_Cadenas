//5. Crea un programa que pida veinte números reales por teclado, los almacene en un array y luego lo recorra para calcular
// y mostrar la media: (suma de valores) / nº de valores.

package Arrays_UnidimensionalesVectores;

import java.util.Scanner;

public class Ejer_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double [] num = new double[20];
        double suma = 0;
        double media = 0;
        double cont = 0;

        System.out.println("Pediré 20 números y después mostraré la media de todos ellos");

        //bucle parar recorrer el array y pedir los valores
        for (int i=0; i<num.length; i++) {

            System.out.println("Dame el valor " + i + ": ");

            num[i] = teclado.nextDouble();

            cont ++;

            suma = suma + num[i];
            media = suma / cont;
        }

        System.out.println("La media de todos los valores introducidos es de: " + media);
    }
}
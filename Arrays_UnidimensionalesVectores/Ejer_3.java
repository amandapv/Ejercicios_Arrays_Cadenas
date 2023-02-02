//3. Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para averiguar
// el máximo y mínimo y mostrarlos por pantalla.

package Arrays_UnidimensionalesVectores;

import java.util.Scanner;

public class Ejer_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double maximo = Integer.MIN_VALUE;
        double minimo = Integer.MAX_VALUE;
        double [] num = new double[10];

        System.out.println("A continuación te diré el máximo y el mínimo de 10 números");

        for (int i=0; i<num.length; i++) {

            System.out.println("Dame el valor " + i + ": ");

            num[i] = teclado.nextDouble();

            if (num[i] < minimo) {
                minimo = num[i];
            } else if (num[i] > maximo){
                maximo = num[i];
            }
        }

        /*Con el for each
        for (Double numeros:num) {

            if (numeros < minimo) minimo = numeros;

            if (numeros > maximo) maximo = numeros;
        }*/

        System.out.print("Número máximo: " + maximo + " y número mínimo " + minimo);

    }
}
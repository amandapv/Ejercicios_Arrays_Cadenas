//8. Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0, utilizando Math.random(), y
// luego le pida al usuario un valor real R. Por último, mostrará cuántos valores del array son igual o superiores a R.

package Arrays_Avanzados_Vectores;

import java.util.Scanner;

public class Ejer_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double [] num = new double [100];
        double numUser;
        int cont= 0;

        System.out.println("Dime un número: ");
        numUser = teclado.nextDouble();

        for (int i=0; i<num.length; i++) {
            num[i]= Math.random(); //Si solo se llama a Math.random() sin ningún parámetro, así sin más, solo toma los valores aleatorios entre 0.0 y 1.0.

            if (numUser == num[i] || numUser < num[i]) {

                cont++;

            }
        }

        System.out.println("Total de números mayores o iguales a " + numUser + " : " + cont);

    }
}
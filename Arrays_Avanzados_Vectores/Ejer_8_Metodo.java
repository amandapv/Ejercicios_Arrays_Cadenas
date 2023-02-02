package Arrays_Avanzados_Vectores;

import java.util.Scanner;

public class Ejer_8_Metodo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double [] num = new double [100];
        double numUser = 0;
        int cont = 0;

        Ejer_8_Metodo ejer8 = new Ejer_8_Metodo();
        ejer8.array_random_1y0(num, numUser, cont, teclado);
    }


    public void array_random_1y0 (double num[], double numUser, int cont, Scanner teclado) {
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
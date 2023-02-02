package Arrays_Avanzados_Vectores;

import java.util.Scanner;

public class Ejer_9_Metodo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] num = new int [100];
        int N = 0;

        Ejer_9_Metodo ejer9 = new Ejer_9_Metodo();
        ejer9.array_random_1y10(num, N, teclado);
    }

    public void array_random_1y10 (int num[], int N, Scanner teclado) {
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
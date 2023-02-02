package Arrays_UnidimensionalesVectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer_6_Metodo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N, M;

        System.out.println("Dime un número N");
        N = teclado.nextInt();

        System.out.println("Dime un número M");
        M = teclado.nextInt();

        int [] num = new int[N];

        Ejer_6_Metodo ej6 = new Ejer_6_Metodo();
        ej6.array_pedir_N_M(num, M);
        ej6.array_leer_N_M(num);

    }

    public void array_pedir_N_M (int num[], int M) {
        Arrays.fill(num, M); //forma de hacer el array con el método Array.fill(), es lo mismo.
    }

    public void array_leer_N_M (int num[]) {
        for (int numeros:num) {
            System.out.print(numeros + " ");

        }
    }
}
package Arrays_UnidimensionalesVectores;

import java.util.Scanner;

public class Ejer_7_Metodo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int P, Q;

        System.out.println("Valor inicial P: ");
        P = teclado.nextInt();

        System.out.println("Valor final Q: ");
        Q = teclado.nextInt();

        int num[] = new int[Q - P + 1];

        Ejer_7_Metodo ej7 = new Ejer_7_Metodo();
        ej7.array_recorrer_P_Q(num, P, Q);
        Ejer_6_Metodo ej6 = new Ejer_6_Metodo(); //este es del ejercicio 6 pero lo llamo
        ej6.array_leer_N_M(num);
    }


    public void array_recorrer_P_Q (int num[], int P, int Q) {

        for(int i = 0; i <num.length; i++) //esta parte no me queda muy clara
        {
            num[i] = P + i;
        }

    }
}
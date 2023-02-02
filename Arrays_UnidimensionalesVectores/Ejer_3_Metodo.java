package Arrays_UnidimensionalesVectores;

import java.util.Scanner;

public class Ejer_3_Metodo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double maximo = Integer.MIN_VALUE;
        double minimo = Integer.MAX_VALUE;
        double [] num = new double[10];

        Ejer_3_Metodo ej3 = new Ejer_3_Metodo(); //Instanciamos un objeto

        ej3.array_min_max(num, minimo, maximo, teclado);
    }


    public void array_min_max (double num[], double minimo, double maximo,Scanner teclado) {

        for (int i=0; i<num.length; i++) {

            System.out.println("Dame el valor " + i + ": ");

            num[i] = teclado.nextDouble();

            if (num[i] < minimo) {
                minimo = num[i];
            } else if (num[i] > maximo){
                maximo = num[i];
            }
        }

        System.out.print("Número máximo: " + maximo + " y número mínimo " + minimo);

    }
}

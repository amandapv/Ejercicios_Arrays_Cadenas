package Arrays_UnidimensionalesVectores;

import java.util.Scanner;

public class Ejer_2_Metodo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double suma = 0;
        double [] num = new double[10];

        Ejer_2_Metodo ej2 = new Ejer_2_Metodo(); //Instanciamos un objeto

        ej2.array_suma(num, suma, teclado);
    }


    public double array_suma (double num[], double suma, Scanner teclado) {

        for (int i=0; i<num.length; i++) {

            System.out.println("Dame el valor " + i + ": ");

            num[i] = teclado.nextDouble();

            suma = suma + num[i];
        }

        System.out.print(suma);

        return suma;
    }
}
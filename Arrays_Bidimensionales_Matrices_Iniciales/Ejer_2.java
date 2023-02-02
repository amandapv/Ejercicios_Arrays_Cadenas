/*
2. Escribe un programa que pida 20 números enteros.
    Estos números se deben introducir en un array de 4 filas por 5 columnas.
    El programa mostrará las sumas parciales de filas y columnas igual que
    si de una hoja de cálculo se tratara.
    La suma total debe aparecer en la esquina inferior derecha.
 */

package Arrays_Bidimensionales_Matrices_Iniciales;

import java.util.Scanner;

public class Ejer_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [][] array = new int [4][5];
        int fila, columna, sumaFila=0, sumaColum=0, sumaTotal=0;

        System.out.println("Dime 20 números: ");

        //lee los datos de teclado
        for (fila=0; fila<4; fila++) {

            for (columna= 0; columna<5; columna++) {

                System.out.print("Fila " + fila + ", columna " + columna + ": ");
                array[fila][columna] = teclado.nextInt();

            }
        }


        //mostrar los datos + suma de filas
        for (fila=0; fila<4; fila++) {

            for (columna=0; columna<5; columna++) {

                System.out.printf("%7d   ", array[fila][columna]);
                sumaFila = array[fila][columna]  + sumaFila;

            }
            System.out.printf("|%7d\n", sumaFila);
            sumaFila = 0; //importante resetear a 0 tras mostrar la suma de la fila para que no almacene el valor anterior + el nuevo
        }


        //Recorrer de columnas a filas para poder hacer la suma de las columnas y total de filas y columnas.
        for(columna = 0; columna < 5; columna++) {
            System.out.print("----------");
        }
        System.out.println("-----------");


        for (columna=0; columna<5; columna++) {

            for (fila=0; fila<4; fila++) {

                sumaColum = array[fila][columna] + sumaColum;

            }

            sumaTotal = sumaTotal + sumaColum;
            System.out.printf("|%7d\n", sumaColum);

            sumaColum = 0; //importante resetear a 0 tras mostrar la suma de la columna para que no almacene el valor anterior + el nuevo
        }

        //sumaTotal = sumaColum + sumaFila;
        System.out.println(" ");
        System.out.printf("%15d   ", sumaTotal);
    }
}
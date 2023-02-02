//4. Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la matriz completa y la última fila.

package Arrays_Bidimensionales_Matrices_Iniciales;

import java.util.Scanner;

public class Ejer_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, m, fila, columna;

        System.out.println("Dime número de filas: ");
        n = teclado.nextInt();
        System.out.println("Dime número de columnas: ");
        m = teclado.nextInt();

        int [][] array = new int [n][m];


        for (fila=0; fila<array.length; fila++) {

            for (columna=0; columna<array[fila].length; columna++) {

                System.out.print("Fila " + fila + ", columna " + columna + ": ");
                array[fila][columna] = teclado.nextInt();

            }
        }

        //mostrar el array
        for (fila=0; fila<array.length; fila++) {

            for (columna=0; columna<array[fila].length; columna++) {
                System.out.printf("%7d   ", array[fila][columna]);
            }
        }

        //mostrar la última fila
    }
}

/*
Define un array de números enteros de 3 filas por 6 columnas con
*    nombre "num" y asigna los valores según la siguiente tabla:
*    num:
*           Columna 0   Columna 1   Columna 2   Columna 3   Columna 4   Columna 5
*    Fila 0     0          30           2                                   5
*    Fila 1    75                                               0
*    Fila 2                            -2           9                      11
*
*    Muestra el contenido de todos los elementos del array dispuestos en
*    forma de tabla como se muestra en la figura.
 */

package Arrays_Bidimensionales_Matrices_Iniciales;

import java.util.Arrays;

public class Ejer_1 {
    public static void main(String[] args) {
        int [][] array = new int [3][6];
        int fila, columna;

        array [0][0] = 0;
        array [0][1] = 30;
        array [0][2] = 2;
        //array [0][3] = 0;
        array [0][5] = 5;
        array [1][0] = 75;
        array [1][4] = 0;
        array [2][2] = -2;
        array [2][3] = 9;
        array [2][5] = 11;

        System.out.print("       ");
        for (columna=0; columna<6; columna++) { //un for para recorrer las columnas


            System.out.print("  Columna " + columna);


            for (fila=0; fila<3; fila++) { //un for para recorrer las filas

                System.out.println();

                System.out.print("Fila " + fila + ": " + array[fila][columna] + " ");

            }
        }
    }
}
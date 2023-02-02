/*12.Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
 ◦ a. Mostrar valores.
 ◦ b. Introducir valor.
 ◦ c. Salir.

  La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una posición P, luego escribirá
  V en la posición P del array. El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que
  terminará el programa.
*/

package Arrays_Avanzados_Vectores;

import java.util.Scanner;

public class Ejer_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] num = new int [10];
        String menu;
        int V, P;
        boolean noSalir = true;


        while (noSalir) {

            System.out.println("Elige una opción para el menú. a - Mostrar valores, b - Introducir valor, c - Salir.");
            menu = teclado.nextLine();

            switch (menu) {
                case "a":
                    for (int numeros:num) {
                        System.out.print(numeros + " ");
                    }

                    System.out.println();
                    break;

                case "b":
                    System.out.println("Dime un valor");
                    V = teclado.nextInt();

                    System.out.println("Dime una posición");
                    P = teclado.nextInt();

                    if (P < 0 || P >= num.length) {
                        System.out.println("Posición no permitida");
                    } else {
                        num[P] = V;
                    }
                    break;

                case "c":
                    System.out.println("Adiós");
                    noSalir = false;
                    break;
            }
        }
    }
}
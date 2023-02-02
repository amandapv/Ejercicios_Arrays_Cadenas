package Arrays_Avanzados_Vectores;

import java.util.Scanner;

public class Ejer_12_Metodo_Simple {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] num = new int [10];
        String menu = "";
        int V=0, P=0;
        boolean noSalir = true;

        Ejer_12_Metodo_Simple ejer12 = new Ejer_12_Metodo_Simple();
        ejer12.array_menu(num, menu, V, P, noSalir, teclado);

    }

    public void array_menu(int num[], String menu, int V, int P, boolean noSalir, Scanner teclado) {

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

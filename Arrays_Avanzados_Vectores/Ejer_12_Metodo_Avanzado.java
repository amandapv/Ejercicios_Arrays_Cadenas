package Arrays_Avanzados_Vectores;

import java.util.Scanner;

public class Ejer_12_Metodo_Avanzado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] num = new int [10];
        String menu = "";
        int V=0, P=0;
        boolean noSalir = true;

        //declarar objeto no estático
        Ejer_12_Metodo_Avanzado ejer12_av = new Ejer_12_Metodo_Avanzado();

        System.out.println("Elige una opción para el menú. a - Mostrar valores, b - Introducir valor, c - Salir.");
        menu = teclado.nextLine();

        while (noSalir) {
            System.out.println("Elige una opción para el menú. a - Mostrar valores, b - Introducir valor, c - Salir.");
            menu = teclado.nextLine();

            switch (menu) {
                case "a":
                    ejer12_av.mostrar_valores(num);
                    break;
                case "b":
                    ejer12_av.introducir_valor(V, P, num, teclado);
                    break;
                case "c":
                    ejer12_av.salir(noSalir);
                    break;
            }
        }
    }


    public void mostrar_valores(int num[]) {
        for (int numeros:num) {
            System.out.print(numeros + " ");
        }

        System.out.println();
    }


    public void introducir_valor(int V, int P, int num[], Scanner teclado) {
        System.out.println("Dime un valor");
        V = teclado.nextInt();

        System.out.println("Dime una posición");
        P = teclado.nextInt();

        if (P < 0 || P >= num.length) {
            System.out.println("Posición no permitida");
        } else {
            num[P] = V;
        }
    }


    public void salir(boolean noSalir) {
        System.out.println("Adiós");
        noSalir = false;
    }

}
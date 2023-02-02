package Arrays_Avanzados_Vectores;

import java.util.Scanner;

public class Ejer_10_Metodo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime a cuantas personas le quieres calcular su altura: ");
        int N = teclado.nextInt();

        int [] num = new int [N];
        double maximo = Integer.MIN_VALUE;
        double minimo = Integer.MAX_VALUE;
        int encimaMedia=0;
        int debajoMedia=0;
        double suma=0;
        double media=0;

        Ejer_10_Metodo ejer10 = new Ejer_10_Metodo();
        ejer10.array_altura(N, num, maximo, minimo, encimaMedia, debajoMedia, suma, media, teclado);
    }

    public void array_altura (int N, int num[], double maximo, double minimo, int encimaMedia, int debajoMedia, double suma, double media, Scanner teclado) {

        for (int i=0; i<num.length; i++) {

            System.out.println("¿Altura de la persona?");
            num[i] = teclado.nextInt();

            //altura máxima
            if (num[i] < minimo) {
                minimo = num[i];
            }
            //altura mínima
            if (num[i] > maximo) {
                maximo = num[i];
            }
            //altura media
            suma=suma+num[i];
            media = suma / N;

            //por encima de la media
            if (num[i] > media) {
                encimaMedia++;
            }
            //por debajo de la media
            if (num[i] < media) {
                debajoMedia++;
            }
        }

        System.out.println("Altura máxima: " + maximo + ". Altura mínima: " + minimo + ". Media: " + media);
        System.out.println("Hay por encima de la media " + encimaMedia + " personas" + ", y por debajo hay " + debajoMedia + " personas");

    }
}

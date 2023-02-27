//2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales o no, además de si son
// iguales sin diferenciar entre mayúsculas y minúsculas.

package Arrays_Cadenas;

import java.util.Objects;
import java.util.Scanner;

public class Ejer_02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena1;
        String cadena2;

        System.out.println("Cadena 1 a comparar: ");
        cadena1 = teclado.nextLine();

        System.out.println("Cadena 2 a comparar: ");
        cadena2 = teclado.nextLine();

        String minusculas1 = cadena1.toLowerCase();
        String minusculas2 = cadena2.toLowerCase();


        if (minusculas1.equals(minusculas2)) { //comparar si ambas cadenas tienen el mismo contenido
           // cadena1.compareToIgnoreCase(cadena2);
            System.out.println("Ambas cadenas son iguales");
        } else {
            System.out.println("No son iguales la cadena 1 y la cadena 2");
        }
    }
}
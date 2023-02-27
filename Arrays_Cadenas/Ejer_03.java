//3. Crea un programa que pida dos cadenas de texto y luego las muestre en orden alfabético (sin diferenciar entre
// mayúsculas y minúsculas).

package Arrays_Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer_03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena1;
        String cadena2;

        System.out.println("Cadena 1 a ordenar: ");
        cadena1 = teclado.nextLine();

        System.out.println("Cadena 2 a ordenar: ");
        cadena2 = teclado.nextLine();

        String minusculas1 = cadena1.toLowerCase();
        String minusculas2 = cadena2.toLowerCase();


        if (minusculas1.compareToIgnoreCase(minusculas2) < 0) {
            System.out.println("hola");
        }
        else if (minusculas1.compareToIgnoreCase(minusculas2) == 0){
            System.out.println("iguales");
        } else {
            System.out.println("adiós");
        }

    }
}

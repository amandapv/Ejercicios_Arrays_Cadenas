//1. Crea un programa que pida una cadena de texto y luego la muestre tanto en mayúsculas como en minúsculas.

package Arrays_Cadenas;

import java.util.Scanner;

public class Ejer_01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String convertir;

        System.out.println("Cadena a convertir en mayúsculas y minúsculas: ");
        convertir = teclado.nextLine();

        String mayusculas = convertir.toUpperCase(); //definir un String para almacenar en "mayusculas" la conversión de poner la cadena introducida en mayúsculas
        String minusculas = convertir.toLowerCase(); //definir un String para almacenar en "minusculas" la conversión de poner la cadena introducida en minusculas

        System.out.println("Tu texto en mayúsculas: " + mayusculas + ". En minúsculas: " + minusculas);
    }
}
//4. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego mostrará un código de
// usuario (en mayúsculas) formado por la concatenación de las tres primeras letras de cada uno de ellos.

package Arrays_Cadenas;

import java.util.Scanner;

public class Ejer_04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre;
        String apellido1;
        String apellido2;
        String conc_codigo_user;

        System.out.println("¿Nombre?");
        nombre = teclado.nextLine();

        System.out.println("¿Primer apellido?");
        apellido1 = teclado.nextLine();

        System.out.println("¿Segundo apellido?");
        apellido2 = teclado.nextLine();

        String minusculas1 = nombre.toUpperCase();
        String minusculas2 = apellido1.toUpperCase();
        String minusculas3 = apellido2.toUpperCase();



        System.out.println("Su código es: ");
    }
}
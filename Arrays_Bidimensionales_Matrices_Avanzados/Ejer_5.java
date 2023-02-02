/*5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa y detectar si existe
   brecha salarial entre ambos. El programa pedirá por teclado la información de N personas distintas (valor también
   introducido por teclado).
  Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una
   única matriz. Luego se mostrará por pantalla el sueldo medio de cada género.
*/

package Arrays_Bidimensionales_Matrices_Avanzados;

import java.util.Scanner;

public class Ejer_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N; //N = número de personas
        int contMujer=0, contHombre=0, columna, persona;
        double mediaMujer, mediaHombre, sumaMujer=0, sumaHombre=0, salario=0;

        System.out.print("Número de personas a calcular: ");
        N = teclado.nextInt();

        double [][] array = new double [N][2];


        //Recorrer el array + mostrar datos + sueldo medio de cada género
        for (columna=0; columna<N; columna++) {

            System.out.print("¿Género (Opciones: 0 para hombre y 1 para mujer) de la persona " + columna + "?");
            array[columna][0] = teclado.nextDouble(); //el 0 hace referencia a mi columna "Género"

            System.out.print("¿Salario de la persona " + columna + "?");
            array[columna][1] = teclado.nextDouble(); //el 1 hace referencia a mi columna "Salario"

            if (array[columna][0] == 0) {
                //System.out.println("El salario de la persona " );
                sumaHombre = sumaHombre + array[columna][1];
                contHombre++;
            }

            else if (array[columna][0] == 1) {
                //System.out.println("El salario de la persona " );
                sumaMujer = sumaMujer + array[columna][1];
                contMujer++;
            }
        }

        mediaMujer = sumaMujer / contMujer;
        mediaHombre = sumaHombre / contHombre;
        System.out.println("suma"+ sumaHombre);

        System.out.println("Media del salario de las mujeres: " + mediaMujer);
        System.out.println("Media del salario de los hombres: " + mediaHombre);
    }
}

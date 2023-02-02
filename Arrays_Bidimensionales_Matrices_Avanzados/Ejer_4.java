//4. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5
// asignaturas. El usuario introducirá las notas por teclado y luego el programa mostrará la nota mínima, máxima y media
// de cada alumno.

package Arrays_Bidimensionales_Matrices_Avanzados;

import java.util.Scanner;

public class Ejer_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [][] array = new int [4][5];
        int alumno, nota_asig;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int cont=0;
        double media, suma;

        System.out.println("Te voy a pedir las notas para las 5 asignaturas.");


        //lee los datos de teclado
        for (alumno=0; alumno<4; alumno++) {

            for (nota_asig= 0; nota_asig<5; nota_asig++) {

                System.out.print("Alumno " + alumno + ", nota de la asignatura " + nota_asig + ": ");
                array[alumno][nota_asig] = teclado.nextInt();

            }
        }


        //mostrar los datos + cálculo del mínimo, máximo y media
        for (alumno=0; alumno<4; alumno++) {

            minimo = array[alumno][0]; //reseteo a la primera nota de cada alumno, es decir a la posición 0 de la nota de cada alumno
            maximo = array[alumno][0];
            suma = 0;
            cont = 0;

            for (nota_asig=0; nota_asig<5; nota_asig++) {

                System.out.printf("%7d   ", array[alumno][nota_asig]);

                if (array[alumno][nota_asig] < minimo) {
                    minimo = array[alumno][nota_asig];
                }
                if (array[alumno][nota_asig] > maximo){
                    maximo = array[alumno][nota_asig];
                }

                suma = suma + array[alumno][nota_asig];
                cont++;

            }

            System.out.println("Nota mínima del alumno " + alumno + ", es de: " + minimo);
            System.out.println("Nota máxima del alumno " + alumno + ", es de: " + maximo);

            media = suma / cont;
            System.out.println("Suma: " + suma);
            System.out.println("La media del alumno " + alumno + ", es de: " + media);
            System.out.println("    ");

        }

    }
}
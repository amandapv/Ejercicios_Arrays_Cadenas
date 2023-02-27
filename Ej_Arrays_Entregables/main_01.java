package Ej_Arrays_Entregables;

import java.util.ArrayList;
import java.util.Scanner;

public class main_01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int menu;
        boolean noSalir = true;

        //crear un ArrayList
        ArrayList<notas_alumnos_01> arraylist_notas = new ArrayList<notas_alumnos_01>(100);

        /*for(int j = 0 ; j < 100 ; j++) {
            notas_alumnos_01 obj_notas = new notas_alumnos_01("a"+j, j);

            //guardarlo en el arraylist
            arraylist_notas.add(obj_notas);
        }*/


        while (noSalir) {
            System.out.println("Elige una opción para el menú. 1- Ver notas, 2- Añadir nota, 3- Borrar nota, 4- Estadísticas, 5- Ver suspensos , 6- Salir");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    notas_operaciones_01.mostrarNotas(arraylist_notas);
                    break;
                case 2:
                    notas_operaciones_01.insertarNota(arraylist_notas);
                    break;
                case 3:
                    notas_operaciones_01.eliminarNota(arraylist_notas);
                    break;
                case 4:
                    notas_operaciones_01.calcularMediaAlumnos(arraylist_notas);
                    notas_operaciones_01.calcularMaximaAlumnos(arraylist_notas);
                    notas_operaciones_01.calcularMinimaAlumnos(arraylist_notas);
                    break;
                case 5:
                    notas_operaciones_01.verSuspensos(arraylist_notas);
                    break;
                case 6:
                    System.out.println("Adiós");
                    noSalir = false;
                    break;
            }
        }
    }
}
package Ej_Arrays_Entregables;

import java.util.ArrayList;
import java.util.Scanner;

public class notas_operaciones_01 {

    public static void mostrarNotas(ArrayList<notas_alumnos_01> arraylist_notas) {
        int pos = 0;
        for (notas_alumnos_01 nota : arraylist_notas) {
            System.out.println("Nota " + pos + ": " +nota.toString());
            pos++;
        }
    }

    public static void insertarNota(ArrayList<notas_alumnos_01> arraylist_notas) {
        if(arraylist_notas.size() > 100) {
            System.out.println("Ya hay 100 notas");
        } else {
            System.out.println("¿Nombre del alumno? ");
            Scanner teclado = new Scanner(System.in);
            String nombre_nota = teclado.nextLine();

            System.out.println("¿Nota del alumno? ");
            int valor_nota = teclado.nextInt();

            //crear un objecto de la clase notas_alumnos_01 llamado obj_notas
            notas_alumnos_01 obj_notas = new notas_alumnos_01(nombre_nota, valor_nota);

            //guardarlo en el arraylist
            arraylist_notas.add(obj_notas);
        }
    }

    public static void eliminarNota(ArrayList<notas_alumnos_01> arraylist_notas) {
        System.out.println("¿Nombre del alumno a eliminar? ");
        Scanner teclado = new Scanner(System.in);
        String nombre_borrar = teclado.nextLine();

        arraylist_notas.removeIf(alumno -> alumno.getNombre().equals(nombre_borrar));    // Quitamos todos os alumnos de ese nome da ArrayList

    }

    public static void calcularMediaAlumnos(ArrayList<notas_alumnos_01> arraylist_notas) {
        int acumulador = 0;
        int contador = 0;

        if(arraylist_notas.size() == 0) {
            System.out.println("No hay notas");
        } else {
            for (notas_alumnos_01 nota : arraylist_notas) {
               acumulador += nota.getNota();
               contador ++;
            }
            System.out.println("Nota media: " + acumulador/contador);
        }
    }
    public static void calcularMaximaAlumnos(ArrayList<notas_alumnos_01> arraylist_notas) {
        int nota_maxima = 0;
        if(arraylist_notas.size() == 0) {
            System.out.println("No hay notas");
        } else {
            for (notas_alumnos_01 nota : arraylist_notas) {
                if (nota.getNota() > nota_maxima) {
                    nota_maxima = nota.getNota();
                }
            }
            System.out.println("Nota maxima: " + nota_maxima);
        }
    }
    public static void calcularMinimaAlumnos(ArrayList<notas_alumnos_01> arraylist_notas) {
        int nota_minima = 100;
        if(arraylist_notas.size() == 0) {
            System.out.println("No hay notas");
        } else {
            for (notas_alumnos_01 nota : arraylist_notas) {
                if (nota.getNota() < nota_minima) {
                    nota_minima = nota.getNota();
                }
            }
            System.out.println("Nota mínima: " + nota_minima);
        }
    }
    public static void verSuspensos(ArrayList<notas_alumnos_01> arraylist_notas) {
        int total = 0;

        for (notas_alumnos_01 nota : arraylist_notas) {
            if(nota.getNota() < 5) {
                System.out.println("El alumno: " + nota.getNombre() + " está suspenso");
                total++;
            }
        }
        if (total == 0) {
            System.out.println("No hay suspensos");
        }
    }
}

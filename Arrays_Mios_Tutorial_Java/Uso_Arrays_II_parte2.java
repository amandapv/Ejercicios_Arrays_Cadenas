package Arrays_Mios_Tutorial_Java;

public class Uso_Arrays_II_parte2 {
    public static void main(String[] args) {

        int [] matriz_aleatorios = new int[150];

        for (int i=0; i< matriz_aleatorios.length; i++) {

            matriz_aleatorios[i] = (int)Math.round(Math.random()*100);

        }

        //bucle for each (o bucle for simplificado) para leer lo que hay en un array
        for (int numeros:matriz_aleatorios) {

            System.out.print(numeros + " ");

        }
    }
}
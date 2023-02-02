/*11.Crea un programa que cree dos arrays de enteros de tamaño 10. Luego introducirá en el primer array todos los valores
 del 1 al 10. Por último, deberá copiar todos los valores del primer array al segundo array en orden inverso, y mostrar
 ambos por pantalla.*/

package Arrays_Avanzados_Vectores;

public class Ejer_11 {
    public static void main(String[] args) {

        int [] num1 = new int[10];
        int [] num2 = new int[10];

        //insertar en el primer array los valores del 1 al 10
        for (int i=0; i<10; i++) {
            num1[i] = i + 1;
        }

        //copiamos en el segundo array los valores del array uno en orden inversa
        for (int i=0 ; i<10; i++) {
            num2[i] = num1[9-i];
        }

        //mostrar el array 1
        System.out.println("Array 1:");
        for (int numeros:num1) {
            System.out.print(numeros + " ");
        }
        System.out.println();

        //mostrar el array 2
        System.out.println("Array 2:");
        for (int numeros:num2) {
            System.out.print(numeros + " ");
        }
    }
}
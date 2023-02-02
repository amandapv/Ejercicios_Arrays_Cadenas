//14.Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4,
// 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla.

package Arrays_Avanzados_Vectores;

public class Ejer_14 {
    public static void main(String[] args) {
        //versión sin usar un array
        int [] num = new int [55];

        int contI = 0;
        int contJ = 0;
        int cont = 0;
        int suma;

        //bucle con 10 iteraciones porque se tiene que recorrer 10 veces
        /*
        for (int i=0; i<10; i++) {
            contI++;
            //suma = contI + num[i];

            for (int j=0; j<contI; j++) {
                contJ++;

                System.out.print(contI + " ");

            }
        } */

        //version usando un array
        for (int i=0; i<10; i++) {
            //cont++;
            //suma = contI + num[i];
           // System.out.println(contI + " ");

            num[i] = i + 1;

            //System.out.print(num[i] + " pat ");
            //System.out.println(cont);

            for (int j=0; j< num[i] ; j++) {
                contJ++;
                suma = contI + num[i];
                System.out.print(suma + " ");

            }

        }
    }
}

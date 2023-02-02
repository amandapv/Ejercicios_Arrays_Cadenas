package Arrays_Avanzados_Vectores;

public class Ejer_11_Metodo {
    public static void main(String[] args) {
        int [] num1 = new int[10];
        int [] num2 = new int[10];

        Ejer_11_Metodo ejer11 = new Ejer_11_Metodo();
        ejer11.array1(num1);
        ejer11.array2_ordenInverso(num1, num2);
        ejer11.mostrarArray1(num1);
        ejer11.mostrarArray2(num2);

    }


    public void array1(int num1[]) {

        for (int i=0; i<10; i++) {
            num1[i] = i + 1;
        }

    }


    public void array2_ordenInverso(int num1[], int num2[]) {
        for (int i=0 ; i<10; i++) {
            num2[i] = num1[9-i];
        }
    }


    public void mostrarArray1(int num1[]) {
        System.out.println("Array 1:");
        for (int numeros:num1) {
            System.out.print(numeros + " ");
        }
        System.out.println();
    }


    public void mostrarArray2(int num2[]) {
        System.out.println("Array 2:");
        for (int numeros:num2) {
            System.out.print(numeros + " ");
        }
    }
}
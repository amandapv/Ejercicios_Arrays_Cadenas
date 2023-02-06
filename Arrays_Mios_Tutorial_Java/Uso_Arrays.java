package Arrays_Mios_Tutorial_Java;

public class Uso_Arrays {
    public static void main(String[] args) {
        //Una forma de declararlo
        /*int [] mi_matriz = new int[5];

        mi_matriz[0] = 5;
        mi_matriz[1] = 38;
        mi_matriz[2] = -15;
        mi_matriz[3] = 92;
        mi_matriz[4] = 71; */

        //Otra forma de declararlo más simplificada
        int [] mi_matriz = {5, 38, -15, 92, 7};


        mi_matriz[mi_matriz.length-1] = 2222; //reasigno la última posición


        for (int i=0; i<mi_matriz.length; i++) {

            System.out.println("Valor del índice " + i + " = " + mi_matriz[i]);

        }

    }
}
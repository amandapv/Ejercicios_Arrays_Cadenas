package Arrays_Mios_Tutorial_Java;
import javax.swing.*;

public class Uso_Arrays_II {
    public static void main(String[] args) {

        //Declaración del String de forma más completa
        String [] paises = new String[8];

        for (int i=0; i<8; i++) {

            paises[i] = JOptionPane.showInputDialog("Introduce país " + (i+1));
        }

        /*paises[0] = "España";
        paises[1] = "Japón";
        paises[2] = "Corea del Sur";
        paises[3] = "Alemania";
        paises[4] = "Francia";
        paises[5] = "Irlanda";
        paises[6] = "Nueva Zelanda";
        paises[7] = "Egipto";*/


        //Declaración del String de forma simplificada
        //String [] paises = {"España", "Japón", "Corea del Sur", "Alemania", "Francia", "Irlanda", "Nueva Zelanda", "Egipto"};


        //Forma de hacer el bucle con el for normal
        /*for (int i=0; i<paises.length; i++) {
            System.out.println("País " + (i + 1) + " " + paises[i]);
        }*/


        //Forma de hacer el bucle con el for each (bucle for mejorado para trabajar con arrays)
        int i=0;
        for (String elemento:paises) {

            System.out.println("País " + (i + 1) + " " + elemento);

            i ++; //esta variable solo es para que me ponga un número por cada país
        }

    }
}
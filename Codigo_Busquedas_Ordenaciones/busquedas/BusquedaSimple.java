package Codigo_Busquedas_Ordenaciones.busquedas;

public class BusquedaSimple {
    int busquedaSimple(int vector[], int n, int dato) {

        int i;

        for (i = 0; i < n; i++) {
            if (dato == vector[i]) {
                return i;
            }
        }

        return -1;
    }
}

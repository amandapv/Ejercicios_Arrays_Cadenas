package Arrays_Objetos;

public class Ejer_02_Main {

    public static void main(String[] args) {

        String nombre, apellido;
        int edad, salario;

        //definir el array
        Ejer_02_empleado obj[] = new Ejer_02_empleado[10];

        for (int i=0; i<obj.length; i++) {
            obj[i] = new Ejer_02_empleado.empleado("empleado"+i, "apellido"+i, 0, 1092+i);
        }

        System.out.println("Visualización del contenido del array empleado con forEach");
        for (Ejer_02_empleado empleado:obj) {
            System.out.println(empleado + " ");
        }
    }
}
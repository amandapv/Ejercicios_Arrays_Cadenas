/*
2. Array de objetos Empleado (por defecto se tomarán 10). La clase Empleado tendrá los atributos nombre, apellido,
    edad y salario. Introducir los valores y sacar la suma y la media de los salarios.
 */

package Arrays_Objetos;

public class Ejer_02_Main {

    public static void main(String[] args) {
        double suma=0;
        double media;
        int cont=0;

        //declarar el array
        Ejer_02_Empleado obj[] = new Ejer_02_Empleado[10];


        for (int i=0; i<obj.length; i++) {
            //instanciar 10 objetos de la clase Ejer_02_empleado
            obj[i] = new Ejer_02_Empleado("empleado"+i, "apellido"+i, 18+i, 1092+i);

            //realizar la suma de todos los salarios de cada objeto Ejer_02_empleado
            // suma = suma + obj[i].suma_total(); //otra forma de hacerlo mediante un método de la clase Ejer_02_Empleado
            suma = suma + obj[i].emp_salario;
            cont++;
        }


        System.out.println("Visualización del contenido del array empleado con forEach"); //usar un método llamado mostrar_objeto() para mostrar los datos e invocarlo en un forEach que recorre todos los objetos y así mostrar esos datos
        for (Ejer_02_Empleado empleado:obj) {
            empleado.mostrar_objeto();
        }

        media = suma/cont;
        System.out.println();
        System.out.println("El salario total es de " + suma + " y la media es de " + media);

    }
}
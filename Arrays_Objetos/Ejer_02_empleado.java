package Arrays_Objetos;

import java.util.Scanner;

public class Ejer_02_empleado {

    public class empleado {
        public String emp_nombre;
        public String emp_apellido;
        public int emp_edad;
        private double emp_salario;

        //Product class constructor
        public empleado (String nombre, String apellido, int edad, double salario) {
            emp_nombre = nombre;
            emp_apellido = apellido;
            emp_edad = edad;
            emp_salario = salario;
        }

        public empleado() {

        }


    }
}

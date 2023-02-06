package Arrays_Objetos;

public class Ejer_02_Empleado {
    public String emp_nombre;
    public String emp_apellido;
    public int emp_edad;
    public double emp_salario;


    //Product class constructor
    public Ejer_02_Empleado(String nombre, String apellido, int edad, int salario) {
        emp_nombre = nombre;
        emp_apellido = apellido;
        emp_edad = edad;
        emp_salario = salario;
    }


    public void mostrar_objeto() {
        System.out.println("Nombre " + emp_nombre + ", " + emp_apellido + ", edad " + emp_edad + " y salario " + emp_salario);
    }


    //forma de hacerlo mediante método
    /*public double salario_suma() { //método para sumar los salarios
        return emp_salario;
    }*/

}

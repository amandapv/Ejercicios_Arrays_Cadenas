/*
  1. Crear un array de objetos Producto , que será instancia de una clase que tiene dos atributos (IdProducto y
    NombreProducto). Introducir valores en el array y después visualizarlo.
 */

package Arrays_Objetos;

public class Ejer_01 {
    public static void main(String[] args) {
        //definir el array
        productos[] obj = new productos[5];

        //crear e inicializar objetos productos. este caso lo hago a mbano y no con un for
        /*productos p0 = new productos(001, "Freidora de aire");
        productos p1 = new productos(002, "Tablet");
        productos p2 = new productos(003, "Estuche");
        productos p3 = new productos(004, "Cantimplora");
        productos p4 = new productos(005, "Peluche de Shin Chan");

        obj[0] = p0;
        obj[1] = p1;
        obj[2] = p2;
        obj[3] = p3;
        obj[4] = p4;*/

        //display the product object data
        System.out.println("Product Object 1:");
        obj[0].display();
        System.out.println("Product Object 2:");
        obj[1].display();
        System.out.println("Product Object 3:");
        obj[2].display();
        System.out.println("Product Object 4:");
        obj[3].display();
        System.out.println("Product Object 5:");
        obj[4].display();


        //visualizar esos productos con un for each
        System.out.println("Visualización con forEach:");
        for (productos p:obj){
            p.display();
        }


    }

    class productos {
        int pro_Id;
        String pro_name;
        //Product class constructor
        productos (int pid, String n) {
            pro_Id = pid;
            pro_name = n;
        }


        public productos() {
        }

        public void display() {
            System.out.print("Product Id = "+pro_Id + "  " + " Product Name = "+pro_name);
            System.out.println();
        }
    }




}

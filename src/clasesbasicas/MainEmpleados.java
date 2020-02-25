/*
* Nombre: MainEmpleados.java
* Objetivo: clase principal que crea objetos tipo Empleados
* Fecha: 18/02/2020.
*/
package clasesbasicas;

/**
 * @author Benito Guillen
 */
public class MainEmpleados {
   //Método Main
    public static void main(String[] args) {
        
        //Para accesar método y atributos necesitamos crear un objeto de la clase
        Empleados e1 = new Empleados();
        
        //El objeto e1 tiene sus atributos inicializados
        System.out.println("Objeto e1: " + e1.toString());
        
        //Modicar los atributos invocando los métodos SET
        e1.setClave(1);
        e1.setNombre("Leonel Mesi");
        e1.setSueldo(25454.25f);
        
        //Leer los atributos del objeto el invocando a los métodos GET
        System.out.println("L a clave es: " + e1.getClave());
        System.out.println("El nombre es: " + e1.getNombre());
        System.out.println("El salario es: " + e1.getSueldo());
        
        /*
        //Modificamos atributos del objeto, esa operacion se llama "set"
        e1.clave = 23;
        e1.nombre = "Lionel Messi";
        e1.sueldo = (float)23.12;
        
        //Leer atributos del objeto, esa operacion se llama get
        System.out.println("Los elementos del objeto 'e1' son:\n" + 
                e1.clave + "\n" +
                e1.nombre + "\n" +
                e1.sueldo);
        
        //Método "toString" nativo de java nos regresa los atributos en formato String
        System.out.println(e1.toString());
        */
    }
}

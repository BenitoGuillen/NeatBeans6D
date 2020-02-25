/*
*Nombre: Operaciones.java
*Objetivo: muestra la construcción de objeto java
*Fecha: 07/02/2020
*/

package clasesbasicas;

/**
 * @author Benito Guillen
 */
public class Operaciones {
    
    /*
    *Método Constructor.
    *Es un metodo especial en java que permite contruir objetos. Constuctor vacio.
    */
    public Operaciones(){
        
    }
    
    /*
    * Método para comparar dos numeros enteros
    */
    private void compara(int n1, int n2){
        if (n1>n2) {
            System.out.println("El mayor es n1: " + n1 + ", " + n2);
        }
        else if (n2>n1) {
            System.out.println("El mayor es n2: " + n2 + ", " + n1);
        }
        else{
            System.out.println("Los numeros son iguaes: " + n2 + ", " + n1);
        }
    }
    
    /*
    *Método para mostrar los ciclos en java
    */
    private void cuanta(int n1, int n2){
        if (n1<n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.println("Valor de i: " + i);
            }            
        }
        else if (n1>n2) {
            for (int i = n1; i >= n2; i--) {
                System.out.println("Valor de i: " + i);
            }        
        }
        else{
            System.out.println("No puedo contar los números son iguales");  
       }
    }
    
    
    /*
    * Método para sumar dos números enteros
    */
    private int suma(int n1, int n2){
        return n1+n2;
    }
    
    /*
    * Método para restar dos números enteros
    */
    private int resta(int n1, int n2){
        return n1-n2;
    }
    
    /*
    * Método para multiplicar dos números enteros
    */
    private int multipicacion(int n1, int n2){
        return n1*n2;
    }
    
    /*
    * Método para divdir dos números enteros
    */
    private float division(int n1, int n2){
        return (float)n1/(float)n2;
    }
    
    //Método main
    public static void main(String[] args) {
        
        //Que es una clase: es un trozo de codigo que incluye métodos, atributos. constructores, etc.
        //Clase es una productora de objetos.
        //Objeto: es un tipo de dato. Es un istancia de la clase contruido en la memoria de la compu.
        //Cómo constroimos un ojeto? Declarandolo como un tipo de la clase
        Operaciones op;//objeto declarado
        
        //Construir el objeto en la memoria(instanciar)
        op= new Operaciones();
        
        //L clase es una productora de objetos 
        Operaciones op1 = new Operaciones();
        Operaciones op2 = new Operaciones();
        Operaciones op3 = new Operaciones();
        Operaciones op4 = new Operaciones();        
        
        //Teniendo un objeto llamamos los métodos
        int s = op.suma(2, 3);
        int r = op1.resta(3, 45);
        int m = op2.multipicacion(34, 23);
        System.out.println("La suma es: " + s);
        System.out.println("La resta es: " + r);
        System.out.println("La miultiplicación es: " + m);
        //división
        System.out.println("La división es: " + op.division(3, 4));
        //op4.compara(34, 45);
        //op3.cuanta(2, 10);
        //op4.cuanta(-4, 3);
        
        op1.cuanta(-4, -10);
        
        //Clases especiales
        System.out.println("El valor de PI: " + Math.PI);
        System.out.println("Un numero elevado a una potencia: " + Math.pow(3, 3));
        
        
    }
}

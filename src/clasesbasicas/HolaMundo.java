package clasesbasicas;

/**
 * @author Benito Guillen
 */

public class HolaMundo {
    
/*
*Ejemplo método estático
*/
private static void printMensaje(){
    System.out.println("Hola Mundo2");
}
    

/*
*Método suma
*/
private static int suma(int n1, int n2){
    return n1+n2;
}

   public static void main(String[] arg){
       System.out.println("Hola Mundo");
       printMensaje();
       System.out.println("La suma es: "+ suma(5,2));
   } 
}

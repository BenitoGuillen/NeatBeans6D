package clasesbasicas;

/*
* Nombre: Empleados.java
* Objetivo: muestra el uso de atributos en los objetos java
* Fecha: 12/02/2020.
*/

/*
* Todos los metos y atributos que son declarados privados en una clase, solo son accesibles
* por los métodos de esa clase
*/

/**
 * @author Benito Guillen
 */
public class Empleados {
    
    //Atributos de la clase
    private int clave;
    private String nombre;
    private float sueldo;
    
    /*
    * Método constructor....vacio
    */
    public Empleados(){;}
    
    /*
    *Lista de métodos GET que permiten leer los atributos de la clase desde el exterior(desde otra clase)
    */
    //Método pa ra el atributo clave
    public int getClave(){
        return this.clave;
    }
    
    //Método para el atributo nombre
    public String getNombre(){
        return this.nombre;
    }
    
    //Método para el atributo sueldo
    public float getSueldo(){
        return this.sueldo;
    }
    
    /*
    *Lista del método SET
    */
    //Método set para el atributo clave
    public void setClave(int vclave){
        this.clave = vclave;
    }
    
    //Método set para el atributo nombre
    public void setNombre(String name){
        this.nombre = name;
    }
    
    //Método para modificar atributo sueldo
    public void setSueldo(float salary){
        this.sueldo = salary;
    }
    
    /*
    * Método "toString()"
    */
    public String toString(){
        return "Los datos del trabajador son. " + this.clave + "\n" + this.nombre + "\n" + this.sueldo;
    }
}

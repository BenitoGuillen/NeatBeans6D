/*
* Nombre: Measa.java
* Objetivo: permite registrar las mesas de la empresa
* Fecha: 19/02/2020.
*/
package clasesbasicas;

/**
 *
 * @author Benito Guillen
 */
public class Mesas {
    
    private int clave;
    private String material;
    private float precio;
    private String estado;

    public Mesas() {;}
    
    //Ilustrar concepto de sobre carga de métodos
    //Constructor sobre cargado con el mismo nombre la difrencia es el tipo y los argumentos

    public Mesas(int clave, String material, float precio, String estado) {
        this.clave = clave;
        this.material = material;
        this.precio = precio;
        this.estado = estado;
    }
    

    public int getClave() {
        return clave;
    }

    public String getMaterial() {
        return material;
    }

    public float getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

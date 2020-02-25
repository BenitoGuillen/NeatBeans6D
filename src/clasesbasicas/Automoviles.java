/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesbasicas;

/**
 *
 * @author Benito Guillen
 */
public class Automoviles {
    
    private String marca;
    private String modelo;
    private float costo;

    public Automoviles() {;}

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public float getCosto() {
        return this.costo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
}

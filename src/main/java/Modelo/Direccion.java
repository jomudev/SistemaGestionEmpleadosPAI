/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author hectormurillo
 */
public class Direccion implements Serializable {
    private final String ciudad;
    private final  String calle;
    
    public Direccion(String ciudad, String calle) {
        this.ciudad = ciudad;
        this.calle = calle;
    }
    
    public String getCiudad() { return ciudad; }
    public String getCalle() { return calle;}
    
    @Override 
    public String toString(){
        return ciudad + ", " + calle;
    }
    
}

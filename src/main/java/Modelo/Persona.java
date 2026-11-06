/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author hectormurillo
 */
public abstract class Persona {
    private final String id;
    private final String nombre;
    private final Direccion direccion;
    
    public Persona(String id, String nombre, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public Direccion getDireccion() { return direccion; }
    
    // Metodo abstracto creado para obligar a las subclases a implementar su calculo de sueldo
    public abstract double calcularSalario();
}

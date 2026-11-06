/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Empleado;
import Modelo.Direccion;
import Persistencia.ArchivoEmpleadoDAO;
import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author hectormurillo
 */
public class EmpleadoController {
    private final ArchivoEmpleadoDAO dao;
    
    public EmpleadoController () {
        this.dao = new ArchivoEmpleadoDAO();
    }
    
    public boolean registrarEmpleado(String id, String nombre, String ciudad, String calle, double salario, double bono) {
        try {
             Direccion dir = new Direccion(ciudad, calle);
             Empleado empleado = new Empleado(id, nombre, dir, salario, bono);
             dao.guardarEmpleado(empleado);
             return true;
        } catch (IOException e) {
            System.err.println("Error de E/S "+ e.getMessage()); 
        }
        
        return false;
    }
    
    public ArrayList<String> listarEmpleados() {
        try {
            return dao.leerEmpleados();
        } catch (IOException error) {
            return new ArrayList<>();
        }
        
    }
 }

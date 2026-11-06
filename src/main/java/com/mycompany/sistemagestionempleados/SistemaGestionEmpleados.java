/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemagestionempleados;
import Controlador.EmpleadoController;
import java.util.ArrayList;

/**
 *
 * @author hectormurillo
 */
public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        EmpleadoController controladorEmpleados = new EmpleadoController();
        
        boolean Empleado1Agregado = controladorEmpleados.registrarEmpleado("EMP01", "Hector Murillo", "La Ceiba", "15 de septiembre", 30000, 5000);
        boolean Empleado2Agregado = controladorEmpleados.registrarEmpleado("EMP02", "Daniela Andrade", "Santa Rosa de Copan", "Boulevar del Este", 35000, 5500);
        
        if (Empleado1Agregado && Empleado2Agregado) {
            System.out.println("Empleados agregados correctamente en archivo empleados.txt");
        }
        
        System.out.println("\n--- Lista de empleados en archivo ---");
        ArrayList<String> empleados = controladorEmpleados.listarEmpleados();
        for (String empleado : empleados) {
            System.out.println(empleado);
        }
    }
}

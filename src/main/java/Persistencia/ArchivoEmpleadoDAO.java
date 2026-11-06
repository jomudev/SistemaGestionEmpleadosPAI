/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;
import Modelo.Empleado;
import Modelo.Direccion;
import java.io.*;
import java.util.ArrayList; 

/**
 *
 * @author hectormurillo
 */
public class ArchivoEmpleadoDAO {
    
    private static final String RUTA_ARCHIVO = "empleados.txt";
    
    public void guardarEmpleado(Empleado empleado) throws IOException {
        try (PrintWriter write = new PrintWriter(new FileWriter(RUTA_ARCHIVO, true))) {
            Direccion direccionEmpleado = empleado.getDireccion();
            write.println(empleado.getId() + "; " + empleado.getNombre() + "; " + direccionEmpleado.getCiudad() + "; " + direccionEmpleado.getCalle());
        }
    };
    
    public ArrayList<String> leerEmpleados()throws IOException {
        ArrayList<String> lista = new ArrayList<>();
        File file = new File(RUTA_ARCHIVO);
        if (!file.exists()) return lista;
        
        try (BufferedReader lectorDeBuffer = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = lectorDeBuffer.readLine()) != null) {
                lista.add(linea);
            }
        }
        return lista;
    }
}

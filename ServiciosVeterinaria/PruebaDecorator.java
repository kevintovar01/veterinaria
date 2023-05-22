/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiciosVeterinaria;

/**
 *
 * @author EDWAR
 */
public class PruebaDecorator {
    public static void main(String[] args) {
        Output objSalida = new Output();
        // Crear servicio base
        Servicio servicio1 = new ServicioBase();
        objSalida.show(servicio1.obtenerDescripcion()+". Precio: "+servicio1.calcularCosto());

        // Decorar con servicio de vacunación
        servicio1 = new ServicioVacunacion(servicio1);
        objSalida.show(servicio1.obtenerDescripcion()+". Precio: "+servicio1.calcularCosto());

        // Decorar con servicio de vacunacion y examen
        Servicio servicio2 = new ServicioBase();
        servicio2 = new ServicioVacunacion(servicio2);
        servicio2 = new ServicioExamen(servicio2);
        objSalida.show(servicio2.obtenerDescripcion()+". Precio: "+servicio2.calcularCosto());
        
        // Decorar con servicio de vacunacion, examen y cirugia
        Servicio servicio3 = new ServicioBase();
        servicio3 = new ServicioVacunacion(servicio3);
        servicio3 = new ServicioExamen(servicio3);
        servicio3 = new ServicioCirugia(servicio3);
        objSalida.show(servicio3.obtenerDescripcion()+". Precio: "+servicio3.calcularCosto());
    }
}

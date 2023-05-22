/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiciosVeterinaria;

/**
 *
 * @author EDWAR
 */
public class ServicioVacunacion extends ServicioDecorator {
    public ServicioVacunacion(Servicio servicio) {
        super(servicio);
        descripcion = "Servicio de vacunacion";
    }

    @Override
    public String obtenerDescripcion() {
        return servicio.obtenerDescripcion() + ", " + descripcion;
    }

    @Override
    public double calcularCosto() {
        return servicio.calcularCosto() + 20000.0;
    }
}
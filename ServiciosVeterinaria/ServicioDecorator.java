/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiciosVeterinaria;

/**
 *
 * @author EDWAR
 */
public abstract class ServicioDecorator extends Servicio {

    protected Servicio servicio;

    public ServicioDecorator(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String obtenerDescripcion() {
        return servicio.obtenerDescripcion();
    }

    @Override
    public abstract double calcularCosto();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiciosVeterinaria;

/**
 *
 * @author EDWAR
 */
public abstract class Servicio {
    protected String descripcion;

    public String obtenerDescripcion() {
        return descripcion;
    }

    public abstract double calcularCosto();
}

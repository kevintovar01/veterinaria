/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiciosVeterinaria;

/**
 *
 * @author EDWAR
 */
public class ServicioBase extends Servicio {
    public ServicioBase() {
        descripcion = "Servicio basico de la veterinaria";
    }

    @Override
    public double calcularCosto() {
        return 50000.0;
    }
}

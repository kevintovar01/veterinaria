/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediador;

/**
 *
 * @author EDWAR
 */
public class Cliente extends Interesado{
    private Mediador mediador;

    public Cliente(Mediador mediador) {
        this.mediador = mediador;
    }

    public void reservarCita() {
        // Lógica para reservar una cita
        mediador.reservarCita(this);
    }

    @Override
    public String recibirMensaje(String mensaje) {
        return "Mensaje recibido por el cliente: " + mensaje;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediador;

/**
 *
 * @author EDWAR
 */
public class Asistente extends Interesado {
    private Mediador mediador;

    public Asistente(Mediador mediador) {
        this.mediador = mediador;
    }

    public void prepararSala() {
        // Lógica para preparar la sala de examen
        mediador.prepararSala(this);
    }

    @Override
    public String recibirMensaje(String mensaje) {
        return "Mensaje recibido por el asistente: " + mensaje;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediador;

/**
 *
 * @author EDWAR
 */
public class Veterinario extends Interesado{
    private Mediador mediador;

    public Veterinario(Mediador mediador) {
        this.mediador = mediador;
    }

    public void atenderPaciente() {
        // Lógica para atender a un paciente
        mediador.atenderPaciente(this);
    }

    @Override
    public String recibirMensaje(String mensaje) {
        return "Mensaje recibido por el veterinario: " + mensaje;
    }
}

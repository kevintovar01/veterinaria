/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediador;

/**
 *
 * @author EDWAR
 */
public class Proveedor extends Interesado {
    private Mediador mediador;

    public Proveedor(Mediador mediador) {
        this.mediador = mediador;
    }

    public void enviarSuministros() {
        // Lógica para enviar los suministros
        mediador.recibirSuministros(this);
    }

    @Override
    public String recibirMensaje(String mensaje) {
        return "Mensaje recibido por el proveedor: " + mensaje;
    }
}
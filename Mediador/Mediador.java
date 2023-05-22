/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediador;

/**
 *
 * @author EDWAR
 */
public interface Mediador {
    public void reservarCita(Cliente cliente);
    public void atenderPaciente(Veterinario veterinario);
    public void prepararSala(Asistente asistente);
    public void recibirSuministros(Proveedor proveedor);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediador;

import java.util.ArrayList;

/**
 *
 * @author EDWAR
 */
public class Veterinaria implements Mediador {
    
    Output objSalida = new Output();

    private ArrayList<Interesado> interesados;
    
    public Veterinaria(){
        this.interesados = new ArrayList<>();
    }
    
     public void agregarInteresado(Interesado interesado){
        this.interesados.add(interesado);
    }

    //Cada uno de estos métodos realiza una tarea específica y llama al método 
    //recibirMensaje() en el objeto correspondiente para notificarlo de que se ha realizado esa tarea.
    @Override
    public void reservarCita(Cliente cliente) {
        objSalida.show("La cita ha sido reservada para el cliente");
        objSalida.show(cliente.recibirMensaje("La cita ha sido reservada"));
    }

    @Override
    public void atenderPaciente(Veterinario veterinario) {
        objSalida.show("El paciente ha sido atendido por el veterinario");
        objSalida.show(veterinario.recibirMensaje("El paciente ha sido atendido"));
    }

    @Override
    public void prepararSala(Asistente asistente) {
        objSalida.show("La sala de examen ha sido preparada por el asistente");
        objSalida.show(asistente.recibirMensaje("La sala de examen ha sido preparada"));
    }

    @Override
    public void recibirSuministros(Proveedor proveedor) {
        objSalida.show("Los suministros han sido recibidos por la veterinaria");
        objSalida.show(proveedor.recibirMensaje("Los suministros han sido entregados"));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantilla;

/**
 *
 * @author EDWAR
 */
public class TratamientoGato extends TratamientoAnimal {
    
    Output objSalida = new Output();
    
    @Override
    protected void prepararEquipo() {
        equipo = "Equipo específico para gatos";
        objSalida.show("Preparando equipo para tratamiento de gatos...");
    }

    @Override
    protected void administrarMedicamentos() {
        objSalida.show("Administrando medicamentos al gato " + animal.getNombre() + "...");
    }

    @Override
    protected void realizarExamen() {
        objSalida.show("Realizando examen al gato " + animal.getNombre() + "...");
    }

    @Override
    protected void finalizarTratamiento() {
        objSalida.show("Finalizando tratamiento para el gato " + animal.getNombre() + "...");
    }
}

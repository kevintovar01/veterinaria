/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantilla;

/**
 *
 * @author EDWAR
 */
public class TratamientoPerro extends TratamientoAnimal {
    
    Output objSalida = new Output();
    @Override
    protected void prepararEquipo() {
        equipo = "Equipo específico para perros";
        objSalida.show("Preparando equipo para tratamiento de perros...");
    }

    @Override
    protected void administrarMedicamentos() {
        objSalida.show("Administrando medicamentos al perro " + animal.getNombre() + "...");
    }

    @Override
    protected void realizarExamen() {
        objSalida.show("Realizando examen al perro " + animal.getNombre() + "...");
    }

    @Override
    protected void finalizarTratamiento() {
        objSalida.show("Finalizando tratamiento para el perro " + animal.getNombre() + "...");
    }
}

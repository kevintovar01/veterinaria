/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantilla;

/**
 *
 * @author EDWAR
 */
public abstract class TratamientoAnimal {
    
    protected String equipo;
    protected Animal animal;

    public void tratarAnimal(Animal animal) {
        this.animal = animal;
        prepararEquipo();
        administrarMedicamentos();
        realizarExamen();
        finalizarTratamiento();
    }

    protected abstract void prepararEquipo();
    protected abstract void administrarMedicamentos();
    protected abstract void realizarExamen();
    protected abstract void finalizarTratamiento();
}

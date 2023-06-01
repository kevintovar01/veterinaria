/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author Estudiantes
 */
public class Gato extends Animal{

    public Gato(Servicio servicio) {
        super.servicio = servicio;
    }
    
    @Override
    public String sano() {
        return "El gato se encuentra sano, "+servicio.realizarServicio();  
    }

    @Override
    public String enfermo() {
        return "El gato se encuentra enfermo, "+servicio.noRealizarServicio();
    }

    @Override
    public void setServicio(Servicio servicio) {
        super.servicio = servicio;
    }
}

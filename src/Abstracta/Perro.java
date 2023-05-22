/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstracta;

import implementador.Servicio;

/**
 *
 * @author Estudiantes
 */
public class Perro extends Animal {
    
     public Perro(Servicio servicio) {
        super.servicio = servicio;
    }

    @Override
    public String sano() {
        return "El perro se encuentra sano, "+ servicio.realizarServicio();   
    }

    @Override
    public String enfermo() {
        return "El perro se encuentra enfermo, " + servicio.noRealizarServicio();
    }

    @Override
    public void setServicio(Servicio servicio) {
        super.servicio = servicio;
    }
}

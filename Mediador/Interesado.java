/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediador;

/**
 *
 * @author EDWAR
 */
public abstract class Interesado{
    protected Mediador mediador;
    
    public Mediador getMediador(){
        return this.mediador;
    }
    
    public void setMediador( Mediador mediador ){
        this.mediador = mediador;
    }
    
    // Método a implementar por las clases que hereden
     public abstract String recibirMensaje(String mensaje);
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author Estudiantes
 */
public abstract class Animal {
    
    protected Servicio servicio;
    public abstract String sano();
    public abstract String enfermo();
    public abstract void setServicio(Servicio servicio);
}

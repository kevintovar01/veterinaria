/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantilla;

/**
 *
 * @author EDWAR
 */
public class Gato extends Animal {
    private String color;
    

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
       
    }

    public String getColor() {
        return color;
    }
}

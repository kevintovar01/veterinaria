/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantilla;

/**
 *
 * @author EDWAR
 */
public class Perro extends Animal{
    private String raza;
    private int edad;

    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantilla;

/**
 *
 * @author EDWAR
 */
public class PruebaPlantilla {

    public static void main(String[] args) {
        Animal perro = new Perro("Firulais", "Labrador Retriever", 3);
        TratamientoAnimal tratamientoPerro = new TratamientoPerro();
        tratamientoPerro.tratarAnimal(perro);

        Animal gato = new Gato("Garfield", "Naranja");
        TratamientoAnimal tratamientoGato = new TratamientoGato();
        tratamientoGato.tratarAnimal(gato);
    }
}

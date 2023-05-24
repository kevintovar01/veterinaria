/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author EDWAR
 */
public class Veterinario implements Observador {
    
    Output objSalida = new Output();
    private String nombre;

    public Veterinario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        objSalida.show(nombre + ": " + mensaje);  
    }
}

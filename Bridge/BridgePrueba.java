/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bridge;

/**
 *
 * @author Estudiantes
 */
public class BridgePrueba {
 
    public static void main(String[] args) {
        Servicio servicio = new ServicioCortePelo();
        Output objSalida = new Output();
        Animal perro = new Perro(servicio);
        Animal gato = new Gato(servicio);
        
        objSalida.show("Cortes de Pelo");
        objSalida.show(perro.sano());
        objSalida.show(perro.enfermo());
        objSalida.show(gato.sano());
        objSalida.show(gato.enfermo());
        
        Servicio servicio2 = new ServicioBano();
        perro.setServicio(servicio2);
        gato.setServicio(servicio2);
        
        objSalida.show("\nBano");
        objSalida.show(perro.sano());
        objSalida.show(perro.enfermo());
        objSalida.show(gato.sano());
        objSalida.show(gato.enfermo());
        
    }   
}

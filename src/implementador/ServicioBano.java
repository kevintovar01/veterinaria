/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementador;

/**
 *
 * @author Estudiantes
 */
public class ServicioBano extends Servicio{

    @Override
    public String realizarServicio() {
        return "Se le esta realizando un bano.";
    }

    @Override
    public String noRealizarServicio() {
        return "No se puede banar, esta con resfriado";
    }
}

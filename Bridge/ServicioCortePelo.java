/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author Estudiantes
 */
public class ServicioCortePelo extends Servicio{

    @Override
    public String realizarServicio() {
        return "Se le esta realizando un corte de pelo.";
    }

    @Override
    public String noRealizarServicio() {
        return "No se le puede realizar el corte, puede empeorar";
    }
}

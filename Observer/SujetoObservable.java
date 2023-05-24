/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author EDWAR
 */
public interface SujetoObservable {
    public void agregarObservador(Observador observador);
    public void eliminarObservador(Observador observador);
    public void notificarObservadores(String mensaje);
}

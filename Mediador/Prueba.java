/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediador;

/**
 *
 * @author EDWAR
 */
public class Prueba {

    public static void main(String[] args) {
        
        //instancia de la clase Veterinaria que actua como mediadorConcreto
        //y se encarga de coordinar las interacciones entre todas las partes interesadas.
        Veterinaria veterinaria = new Veterinaria();
        
        
        
        //se crean las instancias de todas las partes interesadas en la interacción
        Veterinario veterinario = new Veterinario(veterinaria);
        Asistente asistente = new Asistente(veterinaria);
        Cliente cliente = new Cliente(veterinaria);
        Proveedor proveedor = new Proveedor(veterinaria);

        //establece las conexiones entre todas las partes interesadas 
        //y la clase Veterinaria, para que puedan comunicarse entre ellas a través del mediador.
        veterinaria.agregarInteresado(veterinario);
        veterinaria.agregarInteresado(asistente);
        veterinaria.agregarInteresado(cliente);
        veterinaria.agregarInteresado(proveedor);

        
       //lleva a cabo la tarea específica y se comunica con la clase Veterinaria para coordinar su interacción
        cliente.reservarCita();
        asistente.prepararSala();
        veterinario.atenderPaciente();
        proveedor.enviarSuministros();
    }
}

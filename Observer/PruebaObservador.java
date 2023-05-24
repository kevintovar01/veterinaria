/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author EDWAR
 */
public class PruebaObservador {
    public static void main(String[] args) {
        // Crear instancias del sujeto observable y los observadores
        Mascota mascota = new Mascota();
        Veterinario veterinario1 = new Veterinario("Dr. Juan");
        Veterinario veterinario2 = new Veterinario("Dr. Maria");
        DueñoMascota dueñoMascota = new DueñoMascota("Pedro");
        DueñoMascota dueñoMascota2 = new DueñoMascota("Camila");
        

        // Suscribir los observadores al sujeto observable
        mascota.agregarObservador(veterinario1);
        mascota.agregarObservador(veterinario2);
        mascota.agregarObservador(dueñoMascota);
        mascota.agregarObservador(dueñoMascota2);
        // Simular un cambio de estado en el mascota
        mascota.setEstado("El mascota ha sido diagnosticado con una enfermedad");

        mascota.setEstado("La mascota se ha recupero satisfactoriamente");
    }
}

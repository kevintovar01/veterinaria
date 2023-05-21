package patronMemento;

import salida.Salida;
import salida.SalidaPantalla;

public class Cliente {

	public static void main(String[] args) {
		Salida salida = new SalidaPantalla();
		
		Caretaker contenedor = new Caretaker();
		RegistroMedicoMascota mascota = new RegistroMedicoMascota("Kernel", "Border collie", "Perro", "3 años", "Maculino", "Todas", "En seguimiento");
		
		mascota.mostrarRegistro(salida); //muestra datos del registro de la mascota
		contenedor.addMemento(mascota.guardarRegistro()); //Se guarda el registro de nuestra mascota
		
		/*Actualizamos datos del registro*/
		mascota.setDiagnostico("Gravedad"); 
		mascota.setEdad("5 años");
		
		/* guardamos nuestro nuevo registro */
		contenedor.addMemento(mascota.guardarRegistro());
		mascota.mostrarRegistro(salida);
		
		
		/* Volvemos a nuestro registro anterior */
		salida.salida("\nRegistro Anterior: ");
		RegistroMemento m = contenedor.getMemento(0);
		mascota.registroAnterior(m);
		mascota.mostrarRegistro(salida);
		
	}
}
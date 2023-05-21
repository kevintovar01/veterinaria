package patronPesoLigero;

import salida.Salida;
import salida.SalidaPantalla;

public class Veterinaria {
	private String nombre;
	private Salida salida;
	private FabricaCitas citas;
	
	public Veterinaria(String nombre){
		this.nombre = nombre;
		salida = new SalidaPantalla();
		citas = new FabricaCitas();
	}
	
	
	public void consultarCita(String fecha, String hora) {
		salida.salida("\nconsultando cita ...");
		CitaVeterinariaLigera cita = citas.consultarCita(fecha, hora);
		if(cita == null) {
			salida.salida("No hay citas asignadas para este horario");
		}else {
			cita.mostrarInformacion(salida);
		}
		
	}
	
	public void CrearCita(String fecha, String hora, String veterinario, String motivo) {
		citas.getCita(fecha, hora, veterinario, motivo);
	}
	
	public void ListadoCitas() {
		salida.salida("\nCitas programadas: ");
		citas.mostrarCitas();
	}
	
	public void cancelarCita(String fecha, String hora) {
		citas.eliminarCita(fecha, hora);
		salida.salida("Cita cancalada fecha-hora: "+fecha+"-"+hora);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}

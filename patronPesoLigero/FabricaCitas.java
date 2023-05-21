package patronPesoLigero;

import java.util.ArrayList;
import java.util.List;

import salida.Salida;
import salida.SalidaPantalla;

public class FabricaCitas {
	CitaVeterinariaLigera citaLigera;
	Salida salida;
	
	private List<CitaVeterinariaLigera> citas;
	
	public FabricaCitas(){
		citas = new ArrayList<CitaVeterinariaLigera>();
		salida = new SalidaPantalla();
	}
	
	
	public CitaVeterinariaLigera getCita(String fecha, String hora, String veterinario, String motivo) {
		for(CitaVeterinariaLigera cita: citas) {
			if(fecha.equals(cita.getFecha()) && hora.equals(cita.getHora())) {
				return cita;
			}			
		}
		salida.salida("Asignando cita de fecha-hora: "+fecha+"-"+hora);
		CitaVeterinariaLigera cita = new CitaGeneral(fecha, hora, veterinario);
		citas.add(cita);
		return cita;
	}
	
	public CitaVeterinariaLigera consultarCita(String fecha, String hora) {
		for(CitaVeterinariaLigera cita: citas) {
			if(fecha.equals(cita.getFecha()) && hora.equals(cita.getHora())) {
				return cita;
			}			
		}
		return null;
	}
	
	public void eliminarCita(String fecha, String hora) {
		for(CitaVeterinariaLigera cita: citas) {
			if(fecha.equals(cita.getFecha()) && hora.equals(cita.getHora())) {
				citas.remove(cita);
				break;
			}			
		}
	}
	
	
	public void mostrarCitas() {
		for(CitaVeterinariaLigera cita: citas) {
			salida.salida("------");
			cita.mostrarInformacion(salida);
		}
	}
	
}

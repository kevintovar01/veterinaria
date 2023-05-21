package patronSingleton;

import java.util.ArrayList;
import java.util.List;

import salida.Salida;
import salida.SalidaPantalla;

public class RegistroDePaciente {
	private List<Paciente> pacientes;
	private static RegistroDePaciente instancia;
	private Salida salida;
	
	private RegistroDePaciente(){
		pacientes = new ArrayList<Paciente>();
		salida = new SalidaPantalla();
	}
	
	public static RegistroDePaciente obtenerRegistros() {
		if(instancia == null) {
			instancia = new RegistroDePaciente();
		}
		return instancia;	
	}
	
	public void addPaciente(Paciente mascota, String motivo) {
		pacientes.add(mascota);
		mascota.setMotivo(motivo);
	}
	
	public void removePaciente(Paciente mascota) {
		pacientes.remove(mascota);
	}
	
	public void consultPaciente(String mascota) {
		for(Paciente p:pacientes) {
			if(p.getId() == mascota) {
				salida.salida("La mascota que se esta consultando es: "+p.getNombre());
				salida.salida("Mas informacion: "+this.toString(p));
				break;
			}else {				
				salida.salida("mascota No encontrada");
			}
		}
	}
	
	public void allPacientes() {
		salida.salida("ID | Nombre |    Raza    | Edad | Motivo");
		for(Paciente p: pacientes) {
			salida.salida(this.toString(p));
		}
	}
	
	public String toString(Paciente m) {
		return m.getId()+"  | "+m.getNombre()+" |"+m.getRaza()+"| "+m.getEdad()+" | "+m.getMotivo()+"*";
		
	}
}

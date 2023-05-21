package patronSingleton;

import salida.Salida;
import salida.SalidaPantalla;

public class Cliente {

	public static void main(String[] args) {
		Salida salida = new SalidaPantalla();
		RegistroDePaciente registros = RegistroDePaciente.obtenerRegistros();
		
		Paciente mascota1 = new Paciente("1", "Kernel","Border collie","3 años" );
		Paciente mascota = new Paciente("2", "Toby","Pastor aleman","2 años" );
		
		registros.addPaciente(mascota1, "Consulta Medica");
		registros.addPaciente(mascota, "Guarderia");
		registros.consultPaciente("1");
		
		salida.salida("-------");
		
		registros.allPacientes();

	}

}

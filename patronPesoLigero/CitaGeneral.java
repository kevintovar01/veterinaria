package patronPesoLigero;

import salida.Salida;

public class CitaGeneral extends CitaVeterinariaLigera{
	private String fecha;
	private String hora;
	private String veterinario;
	private String tipoCita;
	
	public CitaGeneral(String fecha, String hora, String veterinario){
		this.fecha = fecha;
		this.hora = hora;
		this.veterinario = veterinario;
		this.tipoCita = "Cita general";
	}  
	

	public void mostrarInformacion(Salida salida) {
		salida.salida("Fecha: "+fecha);
		salida.salida("Hora: "+hora);
		salida.salida("Veterinario: "+veterinario);
		salida.salida("Tipo de cita: "+tipoCita);
	}


	public String getVeterinario() {
		return veterinario;
	}


	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}


	public String getTipoCita() {
		return tipoCita;
	}


	public void setTipoCita(String motivo) {
		this.tipoCita = tipoCita;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
}
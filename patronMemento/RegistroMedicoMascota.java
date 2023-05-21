package patronMemento;

import salida.Salida;

public class RegistroMedicoMascota {
	private String nombre;
	private String raza;
	private String especie;
	private String edad;
	private String genero;
	private String vacunas;
	private String diagnostico;
	
	public RegistroMedicoMascota(String nombre, String raza, String especie, String edad, String genero, String vacunas, String diagnostico) {
		this.nombre = nombre;
		this.raza = raza;
		this.especie = especie;
		this.edad = edad;
		this.genero = genero;
		this.vacunas = vacunas;
		this.diagnostico = diagnostico;
	}
	
	
	public RegistroMemento guardarRegistro() {
		return new RegistroMemento(nombre, raza, especie, edad, genero, vacunas, diagnostico);
	}
	
	public void registroAnterior(RegistroMemento m) {
		this.nombre = m.getNombre();
		this.raza = m.getRaza();
		this.especie = m.getEspecie();
		this.edad = m.getEdad();
		this.genero = m.getGenero();
		this.vacunas = m.getVacunas();
		this.diagnostico = m.getDiagnostico();
	}
	
	public void mostrarRegistro(Salida salida) {
		salida.salida("\n-Registro-\n");
		salida.salida("Nombre: "+ nombre);
		salida.salida("Raza: "+raza);
		salida.salida("Especie: "+especie);
		salida.salida("Edad: "+edad);
		salida.salida("Genero: "+genero);
		salida.salida("Vacunas: "+vacunas);
		salida.salida("Diagnostico: "+diagnostico);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getVacunas() {
		return vacunas;
	}


	public void setVacunas(String vacunas) {
		this.vacunas = vacunas;
	}


	public String getDiagnostico() {
		return diagnostico;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}	
}
package patronSingleton;

public class Paciente {
	private String id;
	private String nombre;
	private String raza;
	private String edad;
	private String motivo;
	
	Paciente(String id, String nombre, String raza, String edad){
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.id = id;
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	public String getId() {
		return id;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
}
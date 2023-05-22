package patronProxy;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private List<String> permisos;
	
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		permisos = new ArrayList<>();
	}
	
	public void addPermiso(String permiso) {
		permisos.add(permiso);
	}
	
	public boolean verificaPermiso(String permiso) {
		return permisos.contains(permiso);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
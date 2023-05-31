package patronIterador;

import java.util.List;
import java.util.ArrayList;

public class ListaEmpleados<T> extends Agregado<T>{
	
	private List<T> empleados;
	
	public ListaEmpleados() {
		empleados = new ArrayList<>();
	}
	
	
	public Iterador<T> getIterador() {
		return new EmpleadoIterador<T>(this);
	}

	public int size() {
		return empleados.size();
	}

	public T get(int index) {
		return empleados.get(index);
	}

	public void add(T object) {
		empleados.add(object);
	}

	public void remove(T object) {
		empleados.remove(object);
		
	}

}
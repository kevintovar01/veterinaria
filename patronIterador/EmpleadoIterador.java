package patronIterador;

public class EmpleadoIterador<T> extends Iterador<T>{
	ListaEmpleados<T> listaEmpleados;
	private int posicionActual;
	
	public EmpleadoIterador(ListaEmpleados<T> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
		this.posicionActual = 0;
	}

	
	public boolean hasNext() {
		return posicionActual < listaEmpleados.size();
	}


	public Empleado next() {
		Empleado empleado = (Empleado) listaEmpleados.get(posicionActual);
		posicionActual++;
		return empleado;
	}

}
package patronIterador;

import salida.Salida;
import salida.SalidaPantalla;

public class Cliente {

	public static void main(String[] args) {
		Salida salida = new SalidaPantalla();
		ListaEmpleados<Empleado> listaEmpleados = new ListaEmpleados<Empleado>();
		Empleado empleado = new Empleado("Sebastian", "Asistente");
		listaEmpleados.add(empleado);
		listaEmpleados.add(new Empleado("Juan", "Veterinario"));
		listaEmpleados.add(new Empleado("Felipe", "Recepcionista"));
		listaEmpleados.add(new Empleado("Pedro", "Asistente"));
		listaEmpleados.add(new Empleado("Maria", "veterinaria"));
		
		Iterador<Empleado> iterator = listaEmpleados.getIterador();
		
		salida.salida("Lista Empleados");
		while(iterator.hasNext()) {
			Empleado empleadoIter = (Empleado) iterator.next();
			salida.salida("Nombre: "+empleadoIter.getNombre()+" Cargo: "+empleadoIter.getCargo());
		}
		
		salida.salida("Eliminado Empleado: "+empleado.getNombre()+" Cargo: "+empleado.getCargo());
		listaEmpleados.remove(empleado);
	}

}
package patronProxy;

import salida.Salida;
import salida.SalidaPantalla;

public class Cliente {

	public static void main(String[] args) {
		Salida salida = new SalidaPantalla();
		Usuario empleado = new Usuario("Juan");
		empleado.addPermiso("mostrarInventario");
		empleado.addPermiso("addProducto");
		empleado.addPermiso("consultarStock");
		
		
		ServicioVeterinaria proxy = new ServicioVeterinariaProxy(empleado);
		
		proxy.addProducto("Pelota De Goma", 5);
		proxy.addProducto("Alimento Perro", 2);
		proxy.addProducto("Alimento Gato", 1);
		proxy.addProducto("Pelota de goma", 10);
		proxy.mostrarInventario(salida);
		
		proxy.eliminarProductoUnidad("pelota de goma");
	}

}
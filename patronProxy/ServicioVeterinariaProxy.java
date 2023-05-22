package patronProxy;

import salida.Salida;
import salida.SalidaPantalla;

public class ServicioVeterinariaProxy extends ServicioVeterinaria{
	
	private ServicioGestionInventario servicioReal;
	private Usuario usuario;
	private Salida salida;
	
	
	public ServicioVeterinariaProxy(Usuario usuario) {
		this.usuario = usuario;
		this.servicioReal = new ServicioGestionInventario();
		this.salida = new SalidaPantalla();
	}

	
	public int consultarStock(String producto) {
		if(usuario.verificaPermiso("consultarStock")) {
			return servicioReal.consultarStock(producto);
		}
		salida.salida("No cuenta con permisos para counsultar el Stock del productos");
		return 0;
	}

	public void addProducto(String producto, int cantidad) {
		if(usuario.verificaPermiso("addProducto")) {
			servicioReal.addProducto(producto, cantidad);
		}else {
			salida.salida("No cuenta con permisos para agregar productos");
		}
		
	}

	
	public void eliminarProductoUnidad(String producto) {
		if(usuario.verificaPermiso("eliminarProductoUnidad")) {			
			servicioReal.eliminarProductoUnidad(producto);
		}else {
			salida.salida("No cuenta con permisos para eliminar productos");
		}
	}
	
	
	
	public void mostrarInventario(Salida salida) {
		if(usuario.verificaPermiso("mostrarInventario")) {			
			servicioReal.mostrarInventario(salida);
		}else {
			salida.salida("No cuenta con permisos para ver el inventario");
		}
	}
}
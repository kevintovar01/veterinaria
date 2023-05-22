package patronProxy;

import java.util.HashMap;

import salida.Salida;

public class ServicioGestionInventario extends ServicioVeterinaria{
	private HashMap<String, Integer> productos;
	
	public ServicioGestionInventario() {
		productos = new HashMap<String,Integer>();
	}

	
	public int consultarStock(String producto) {
		if(productos.containsKey(producto)) {
			return productos.get(producto);
		}
		return 0;
	}

	
	public void addProducto(String producto, int cantidad) {
		if(productos.containsKey(producto)) {
			productos.replace(producto, productos.get(producto)+cantidad);
		}else {			
			productos.put(producto, cantidad);
		}
		
	}

	public void eliminarProductoUnidad(String producto) {
		if(productos.containsKey(producto)) {
			productos.replace(producto, productos.get(producto)-1);
		}	
	}
	
	public void mostrarInventario(Salida salida) {
		for(String i: productos.keySet()) {
			salida.salida("Producto: "+i+" -- Unidades: "+productos.get(i));
		}
	}
}
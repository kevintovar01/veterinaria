package patronProxy;
import salida.Salida;

public abstract class ServicioVeterinaria {
	public abstract int consultarStock(String producto);
	public abstract void addProducto(String producto, int cantidad);
	public abstract void eliminarProductoUnidad(String producto);
	public abstract void mostrarInventario(Salida salida);
}

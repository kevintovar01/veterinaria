package patronFactoryMethod;

import salida.Salida;
import salida.SalidaPantalla;

public abstract class ServicioVeterinarioCreator {
	Salida salida = new SalidaPantalla();
    public void realizarServicioVeterinario() {
        ServicioVeterinario servicio = crearServicioVeterinario();
        salida.salida(servicio.realizarServicio());
        double costo = servicio.obtenerCosto();
        salida.salida("Costo del servicio: " + costo);
    }

    protected abstract ServicioVeterinario crearServicioVeterinario();
}

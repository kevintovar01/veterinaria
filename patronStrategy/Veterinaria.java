package patronStrategy;

import salida.Salida;
import salida.SalidaPantalla;

public class Veterinaria {
	private TratamientoStrategy tratamientoStrategy;
	Salida salida = new SalidaPantalla();

    public void setEstrategiaTratamiento(TratamientoStrategy strategy) {
        this.tratamientoStrategy = strategy;
    }

    public void realizarTratamiento() {
        if (tratamientoStrategy != null) {
        	salida.salida(tratamientoStrategy.ejecutar());
        } else {
            System.out.println("No se ha establecido una estrategia de tratamiento.");
        }
    }
}

package patronStrategy;

public class Veterinaria {
	private TratamientoStrategy tratamientoStrategy;

    public void setEstrategiaTratamiento(TratamientoStrategy strategy) {
        this.tratamientoStrategy = strategy;
    }

    public void realizarTratamiento() {
        // Realizar el tratamiento utilizando la estrategia actual
        if (tratamientoStrategy != null) {
        	tratamientoStrategy.ejecutar();
        } else {
            System.out.println("No se ha establecido una estrategia de tratamiento.");
        }
    }
}

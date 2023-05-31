package patronFactoryMethod;

public class Vacunacion implements ServicioVeterinario {
    public String realizarServicio() {
    	return "Realizando vacunación...";
        // Lógica específica de la vacunación
    }

    public double obtenerCosto() {
        return 30.0; // Costo específico de la vacunación
    }
}

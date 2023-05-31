package patronFactoryMethod;

public class ConsultaGeneral implements ServicioVeterinario {
    public String realizarServicio() {
    	return "Realizando consulta general...";
        // Lógica específica de la consulta general
    }

    public double obtenerCosto() {
        return 50.0; // Costo específico de la consulta general
    }
}

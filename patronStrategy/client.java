package patronStrategy;

public class client {

	public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria();

        // Seleccionar una estrategia de tratamiento
        TratamientoStrategy estrategiaMedicacion = new MedicacionStrategy();
        veterinaria.setEstrategiaTratamiento(estrategiaMedicacion);

        // Realizar el tratamiento
        veterinaria.realizarTratamiento();

        // Cambiar a otra estrategia de tratamiento
        TratamientoStrategy estrategiaTerapiaFisica = new TerapiaFisicaStrategy();
        veterinaria.setEstrategiaTratamiento(estrategiaTerapiaFisica);

        // Realizar el tratamiento nuevamente
        veterinaria.realizarTratamiento();

	}

}
package patronStrategy;

public class client {

	public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria();

        TratamientoStrategy estrategiaMedicacion = new MedicacionStrategy();
        veterinaria.setEstrategiaTratamiento(estrategiaMedicacion);

        veterinaria.realizarTratamiento();

        TratamientoStrategy estrategiaTerapiaFisica = new TerapiaFisicaStrategy();
        veterinaria.setEstrategiaTratamiento(estrategiaTerapiaFisica);

        veterinaria.realizarTratamiento();
	}

}
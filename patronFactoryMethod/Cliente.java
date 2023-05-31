package patronFactoryMethod;

public class Cliente {

	public static void main(String[] args) {
        ServicioVeterinarioCreator creator = new ConsultaGeneralCreator();
        creator.realizarServicioVeterinario();

        // Puedes probar con otros tipos de servicios también
         ServicioVeterinarioCreator creator1 = new VacunacionCreator();
         creator1.realizarServicioVeterinario();
    }
}
 
package patronFactoryMethod;

public class VacunacionCreator extends ServicioVeterinarioCreator {
    protected ServicioVeterinario crearServicioVeterinario() {
        return new Vacunacion();
    }
}

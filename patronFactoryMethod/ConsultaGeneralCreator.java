package patronFactoryMethod;

public class ConsultaGeneralCreator extends ServicioVeterinarioCreator {
    protected ServicioVeterinario crearServicioVeterinario() {
        return new ConsultaGeneral();
    }
}

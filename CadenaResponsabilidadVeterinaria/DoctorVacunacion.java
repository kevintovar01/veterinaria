package CadenaResponsabilidadVeterinaria;

public class DoctorVacunacion extends Cargo {

    public DoctorVacunacion() {
    }
    
    @Override
    public String SolicitudCargo(String solicitud) {
        if (solicitud.equals("vacunacion")) {
            return "\nEl procedimiento medico es relizado por el Doctor de Vacunaciones. Realizando vacunacion...";
            
        } else if (successor != null) {
            successor.SolicitudCargo(solicitud);
        }
        return null;
    }

}

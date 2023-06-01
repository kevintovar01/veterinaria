package CadenaResponsabilidadVeterinaria;

public class DoctorFisico extends Cargo {

    public DoctorFisico() {
    }

    @Override
    public String SolicitudCargo(String solicitud) {
        if (solicitud.equals("examen fisico")) {
            return "\nEl procedimiento medico es relizado por el Doctor de examen Fisico. Realizando examen fisico...";
            // Realizar la lógica del examen físico aquí
        } else if (successor != null) {
            return successor.SolicitudCargo(solicitud);
        }
        return null;
    }
}
      

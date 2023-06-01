package CadenaResponsabilidadVeterinaria;

public class DoctorCirugia extends Cargo {

    public DoctorCirugia() {
    }

    @Override
    public String SolicitudCargo(String solicitud) {
        if (solicitud.equals("cirugia")) {
            return "\nEl procedimiento medico es relizado por el Doctor de Cirugias. Realizando cirugía...";
            // Realizar la lógica de la cirugía aquí
        } else if (successor != null) {
            successor.SolicitudCargo(solicitud);
        }
        return null;
    }

}

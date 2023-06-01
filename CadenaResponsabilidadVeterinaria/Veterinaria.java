package CadenaResponsabilidadVeterinaria;

public class Veterinaria extends Cargo {

    private Cargo cargo;

    public Veterinaria() {

    }

    @Override
    public String SolicitudCargo(String solicitud) {
        Cargo fisicoCargo = new DoctorFisico();
        this.setSuccessor(fisicoCargo);
        
        Cargo vacunacionCargo = new DoctorVacunacion();
        fisicoCargo.setSuccessor(vacunacionCargo);
        
        Cargo cirugiaCargo = new DoctorCirugia();
        vacunacionCargo.setSuccessor(cirugiaCargo);
        cargo=fisicoCargo;

        return cargo.SolicitudCargo(solicitud);
    }
}

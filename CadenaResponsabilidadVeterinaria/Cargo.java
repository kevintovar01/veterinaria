package CadenaResponsabilidadVeterinaria;

public abstract class Cargo {

    protected Cargo successor;

    public void setSuccessor(Cargo successor) {
        this.successor = successor;
    }

    public abstract String SolicitudCargo(String solicitud);
}


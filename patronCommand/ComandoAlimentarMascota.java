package patronCommand;

public class ComandoAlimentarMascota extends Comando {
    private Mascota mascota;

    public ComandoAlimentarMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String ejecutar() {
        return mascota.alimentar();
    }
}
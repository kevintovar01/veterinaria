package patronCommand;

public class Mascota {
    private String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String alimentar() {
        return "Alimentando a " + nombre;
    }
}
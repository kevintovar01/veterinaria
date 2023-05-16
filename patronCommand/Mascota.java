package patronCommand;

public class Mascota {
    private String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public void alimentar() {
        System.out.println("Alimentando a " + nombre);
    }
}
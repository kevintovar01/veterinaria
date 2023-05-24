package Composite;

public class MascotaIndividual extends Mascota{

    Output objSalida = new Output();

    private String nombre;

    public MascotaIndividual(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void obtenerInformacion() {
        objSalida.show(nombre);
    }
}

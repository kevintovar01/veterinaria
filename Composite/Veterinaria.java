package Composite;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria extends Mascota {

    Output objSalida = new Output();
    private List<Mascota> mascotas;

    public Veterinaria() {
        mascotas = new ArrayList<>();
    }


    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public void quitarMascota(Mascota mascota) {
        mascotas.remove(mascota);
    }
    
    @Override
    public void obtenerInformacion() {
        
        for (Mascota mascota : mascotas) {
            mascota.obtenerInformacion();
        }
    }
}

package Composite;

public class PruebaComposite {

    public static void main(String[] args) {

        Output objSalida = new Output();
        MascotaIndividual mascota1 = new MascotaIndividual("Perro Olaf");
        MascotaIndividual mascota2 = new MascotaIndividual("Gato Felix");
        MascotaIndividual mascota3 = new MascotaIndividual("Loro Claudio");

        Veterinaria veterinaria = new Veterinaria();
        veterinaria.agregarMascota(mascota1);
        veterinaria.agregarMascota(mascota2);
        
        objSalida.show("Mascotas que se encuentran en la veterinaria:");
        veterinaria.obtenerInformacion();
        
        veterinaria.agregarMascota(mascota3);
        
        objSalida.show("Mascotas que se encuentran en la veterinaria:");
        veterinaria.obtenerInformacion();
        
        veterinaria.quitarMascota(mascota2);
        
        objSalida.show("Mascotas que se encuentran en la veterinaria:");
        veterinaria.obtenerInformacion();     
    }
}

package Controlador;


import Modelo.Veterinaria;
import Vista.Salida;

import java.io.IOException;

public class Prueba {

    public static void main(String[] args) throws IOException {
        
        Veterinaria veterinaria = new Veterinaria();
        Salida salida = new Salida();
        String solicitud;
        
        solicitud="vacunacion";
        salida.escribir(veterinaria.SolicitudCargo(solicitud));
        
        solicitud="examen fisico";
        salida.escribir(veterinaria.SolicitudCargo(solicitud));
        
        solicitud="cirugia";
        salida.escribir(veterinaria.SolicitudCargo(solicitud));
    }
}

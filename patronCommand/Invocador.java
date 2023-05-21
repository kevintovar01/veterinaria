package patronCommand;
import java.util.ArrayList;
import java.util.List;

import salida.Salida;
import salida.SalidaPantalla;

public class Invocador {
    private List<Comando> comandos;
    Salida salida = new SalidaPantalla();

    public Invocador() {
        comandos = new ArrayList<>();
    }

    public void agregarComando(Comando comando) {
        comandos.add(comando);
    }

    public void ejecutarComandos() {
        for (Comando comando : comandos) {
            salida.salida( comando.ejecutar());
        }
        comandos.clear();
    }
}
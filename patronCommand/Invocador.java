package patronCommand;
import java.util.ArrayList;
import java.util.List;

public class Invocador {
    private List<Comando> comandos;

    public Invocador() {
        comandos = new ArrayList<>();
    }

    public void agregarComando(Comando comando) {
        comandos.add(comando);
    }

    public void ejecutarComandos() {
        for (Comando comando : comandos) {
            comando.ejecutar();
        }
        comandos.clear();
    }
}
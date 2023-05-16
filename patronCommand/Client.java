package patronCommand;

public class Client {
	public static void main(String[] args) {
        Invocador invocador = new Invocador();

        Mascota perro = new Mascota("Toby");
        ComandoAlimentarMascota comandoAlimentar = new ComandoAlimentarMascota(perro);

        invocador.agregarComando(comandoAlimentar);
       

        invocador.ejecutarComandos();
    }
}

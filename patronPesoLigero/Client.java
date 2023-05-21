package patronPesoLigero;

public class Client {

	public static void main(String[] args) {
		Veterinaria veterinaria = new Veterinaria("pets");
		
		veterinaria.CrearCita("5/20/2023", "11:30 am", "gonzalez", "Revision general");
		veterinaria.CrearCita("6/20/2023", "11:30 am", "gonzalez", "Seguimiento");
		veterinaria.CrearCita("7/20/2023", "11:30 am", "gonzalez", "Revision general");
		veterinaria.cancelarCita("5/20/2023", "11:30 am");
		veterinaria.ListadoCitas();
		veterinaria.consultarCita("7/20/2023", "11:30 am");
	}

}

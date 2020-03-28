package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Profesor prof1 = new Profesor("Fernando", "D104");
		prof1.setHorarioTutorias("Lunes de 10:00 a 13:00");
		prof1.getConsultas();
		
		ProfesorEnfermo profen = new ProfesorEnfermo("Juan", "D105");
		profen.getConsultas();
	}

}

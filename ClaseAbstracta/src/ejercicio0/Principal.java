package ejercicio0;

public class Principal {
	public static void main(String[] args) {

		//--------------- Estudiante -------------------------

		MiembroUPV estu1 = new Estudiante("Juan", 12345, "1ºDAM");
		estu1.setEdad(20);



		double notas []= {7,8.5,4,8,6,7.5,5};
		estu1.setNotas(notas);

		estu1.menuIntranet();


		//------------------- Profesor ----------------------

		MiembroUPV prof1 = new Profesor("Fernando", 0, "D104");
		prof1.setEdad(45);
		prof1.setHorarioTutorias("Lunes de 10:00 a 13:00");


		prof1.menuIntranet();

	}

}

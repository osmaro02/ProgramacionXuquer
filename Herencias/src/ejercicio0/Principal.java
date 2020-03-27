package ejercicio0;

public class Principal {
	public static void main(String[] args) {
		
		//--------------- Estudiante -------------------------
		
		Estudiante estu1 = new Estudiante("Juan", "1ºDAM", 12345);
		estu1.setEdad(20);
		
		Coche c1 = new Coche();
		c1.setMarca("Renault");
		c1.setModelo("Clio");
		c1.setColor("Rojo");
		
		double notas []= {7,8.5,4,8,6,7.5,5};
		estu1.setNotas(notas);
		
		System.out.println("El estudiante "+estu1.nombre+" tiene una media de: "+ estu1.getNotaMedia());
		
		
		//------------------- Profesor ----------------------
		
		Profesor prof1 = new Profesor("Fernando", "D104");
		prof1.setEdad(45);
		prof1.setHorarioTutorias("Lunes de 10:00 a 13:00");
		
		Coche c2 = new Coche();
		c2.setMarca("Opel");
		c2.setModelo("Corsa");
		c2.setColor("Blanco");
	
		prof1.getConsultas();
		
	}
	
}

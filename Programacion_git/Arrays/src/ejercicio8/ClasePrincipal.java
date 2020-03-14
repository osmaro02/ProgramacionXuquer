package ejercicio8;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		
		RegistroMes r1=new RegistroMes(); //Creando el Registro del mes con el constructor por defecto
		r1.setMes("Enero");
		r1.setAnyo(2020);
		
		Temperaturas t1=new Temperaturas(); //Creando el array t1 en el que guardaremos las temperaturas para después asignarlas al RegistroMes r1
		t1.leer();
		r1.setTemperaturas(t1);
		
		System.out.println(r1.toString());
	}

}

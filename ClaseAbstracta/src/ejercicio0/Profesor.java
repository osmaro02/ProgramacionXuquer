package ejercicio0;

public class Profesor extends MiembroUPV {

	//------/ Atributos (private) /-----------------

	private String despacho;
	private String horarioTutorias;

	//--------/ Constructor parametrizado /------------------

	public Profesor(String nombre,int edad, String despacho) {
		super(despacho, edad, despacho);
		this.nombre = nombre;
		this.edad = edad;
		this.despacho = despacho;
	}

	//----------- getters y setters /-------------

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getHorarioTutorias() {
		return horarioTutorias;
	}

	public void setHorarioTutorias(String horarioTutorias) {
		this.horarioTutorias = horarioTutorias;
	}


	public void menuIntranet() {
		System.out.println ("");
		System.out.println("Bienvenido al menú Intranet profesor, seleccione la operación que desee hacer:");
		System.out.println("1-Ver la información del profesor");
		System.out.println("2-Ver nómina del profesor");
		System.out.println("3-¿A qué actividades deportivas desea apuntarse?");
		System.out.println("4-SALIR”");
		System.out.println("");

		int num = 1;

		switch(num){ 

		case 1:

			System.out.println ("Nombre Profesor: "+nombre+", Edad: "+edad+", Despacho: "+despacho+", Horario: "+horarioTutorias);
			System.out.println (".........................................................................");
			break;

		case 2: 
			System.out.println ("Nómina no visible");
			System.out.println(".........................................................................");
			break;

		case 3: 
			System.out.printf("Baloncesto, Futbol, Tenis");
			System.out.println(".........................................................................");
			break;

		case 4: 
			System.out.println ("HASTA LUEGO! Gracias por utilizar la Intranet de profesor");
			System.out.println(".........................................................................");
			break;

		default: 

			System.out.println("");
			System.out.println ("El número ingresado no es correcto");
			break;
		} 

	}
}
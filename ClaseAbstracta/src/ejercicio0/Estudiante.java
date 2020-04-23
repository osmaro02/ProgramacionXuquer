package ejercicio0;

public class Estudiante extends MiembroUPV{

	//------/ Atributos (private) /-----------------
	private int numeroExpediente;
	private String cursoActual;
	private double[] notas = new double[7];


	//--------/ Constructor parametrizado /------------------

	public Estudiante(String nombre, int numeroExpediente, String cursoActual) {
		super(nombre,numeroExpediente,cursoActual);
		this.nombre = nombre;
		this.cursoActual = cursoActual;
		this.numeroExpediente = numeroExpediente;
	}

	//-----------/ getters y setters /------------------

	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	public String getCursoActual() {
		return cursoActual;
	}

	public void setCursoActual(String cursoActual) {
		this.cursoActual = cursoActual;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}


	//----/ getNotaMedia() → Devuelve la nota media del alumno /-----
	public double getNotaMedia() {
		double media = 0;
		for (int cont = 0; cont < notas.length; cont++) {
			media = media + notas[cont];
		}

		media = media/7;
		return media;
	}
	public void menuIntranet() {
		System.out.println ("");
		System.out.println("Bienvenido al menú Intranet estudiante, seleccione la operación que desee hacer:");
		System.out.println("1-Ver Expediente estudiante");
		System.out.println("2-¿A qué actividades deportivas desea apuntarse?");
		System.out.println("4-SALIR”");
		System.out.println("");

		int num = 1;

		switch(num){ 

		case 1:
			System.out.println ("Nombre Estudiante: "+nombre+", Edad: "+edad+", N-Expediente: "+numeroExpediente+", Curso: "+cursoActual);
			System.out.println(".........................................................................");
			break;

		case 2: 
			System.out.printf("Baloncesto, Futbol, Tenis");
			System.out.println(".........................................................................");
			break;

		case 4: 
			System.out.println ("HASTA LUEGO! Gracias por utilizar la Intranet de estudiante");
			System.out.println(".........................................................................");
			break;

		default: 

			System.out.println("");
			System.out.println ("El número ingresado no es correcto");
			break;
		} 
	}
}

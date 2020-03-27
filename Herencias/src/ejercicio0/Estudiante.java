package ejercicio0;

public class Estudiante extends Persona{

	//------/ Atributos (private) /-----------------
	private int numeroExpediente;
	private String cursoActual;
	private double[] notas = new double[7];
	
	
	//--------/ Constructor parametrizado /------------------
	
	/*llama al constructor Persona y después inicializa el número de expediente y el curso actual con los valores que se le pasan por parámetro.
	 *La llamada debe ser de la siguiente forma:
	 *Estudiante(nombre, curso, expediente)
	 */
	
	public Estudiante(String nombre, String cursoActual, int numeroExpediente) {
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

}

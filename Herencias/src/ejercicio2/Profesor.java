package ejercicio2;

public class Profesor extends Persona {
	
	//------/ Atributos (private) /-----------------
	
	protected String despacho;
	protected String horarioTutorias;
	
	//--------/ Constructor parametrizado /------------------
	
	public Profesor(String nombre, String despacho) {
		this.nombre = nombre;
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

	
	//---/ getConsultas() → Devuelve un String con la información de cuando y donde realiza las tutorias /---
	public void getConsultas() {
		System.out.println( "El profesor "+nombre + " tiene tutoria los " + horarioTutorias + " en la sala " + despacho);
	}
	
}
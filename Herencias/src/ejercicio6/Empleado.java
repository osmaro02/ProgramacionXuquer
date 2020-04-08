package ejercicio6;
/*
* @autor: Oscar * Ejercicio 6 Tema 7 – Herencia
* Clase Empleado
*/
public class Empleado {

	//Atributos
	protected String Nombre;
	protected int Edad;
	protected double Salario;
	private final int Plus=500;


	//Contructor por defecto
	public Empleado(){
	}

	//Contructor con 2 parametros
	public Empleado(String nombre,int edad,double salario){
		this.Nombre=nombre;
		this.Edad=edad;
		this.Salario=salario;
	}

	
	//settes y gettes
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		this.Edad = edad;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		this.Salario = salario;
	}

	public int getPlus() {
		return Plus;
	}
}

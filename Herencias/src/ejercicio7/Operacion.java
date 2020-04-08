package ejercicio7;

/*
 * @autor: Oscar * Ejercicio 7 Tema 7 – Herencia
 * Clase Operación
 */
public class Operacion {
	//Atributos
	double num1;
	double num2;
	double resultado;

	//Contructor por defecto
	
	public Operacion() {
		
	}
	
	//Contructor con 2 parametros
	public Operacion(double n1, double n2) {

		this.num1 = n1;
		this.num2 = n2;

	}


	 //settes y gettes

	public double getNum1() {
		return num1;
	}


	public void setNum1(double num1) {
		this.num1 = num1;
	}


	public double getNum2() {
		return num2;
	}


	public void setNum2(double num2) {
		this.num2 = num2;
	}


	public double getResultado() {
		return resultado;
	}


	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
}
package ejercicio7;

/*
 * @autor: Oscar * Ejercicio 5 Tema 7 – Herencia
 * Clase multiplicacion
 */
public class Multiplicacion extends Operacion{

	//Atributos
	double mult;

	//Contructor por defecto
	public Multiplicacion() {

	}

	//Contructor con 2 parametros   
	public Multiplicacion(double n1, double n2) {

		super(n1, n2);
		this.mult = n1 * n2;
		this.setResultado(this.mult);
	}

	public void mostrarResultado(){

		System.out.println(this.num1+" * "+this.num2+" = "+this.resultado);

	}
}

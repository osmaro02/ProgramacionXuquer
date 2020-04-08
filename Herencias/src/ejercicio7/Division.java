package ejercicio7;

/*
* @autor: Oscar * Ejercicio 5 Tema 7 – Herencia
* Clase division
*/
public class Division extends Operacion{

	//Atributos
	double div =0;

	//Contructor por defecto
	public Division() {

	}

	//Contructor con 2 parametros 
	public Division(double n1, double n2) {

		super(n1, n2);
		this.div = n1 / n2;
		this.setResultado(this.div);
	}
	public void mostrarResultado(){

		System.out.println(this.num1+" / "+this.num2+" = "+this.resultado);

	}
}

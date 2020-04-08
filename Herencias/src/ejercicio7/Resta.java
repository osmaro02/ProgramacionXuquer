package ejercicio7;

/*
* @autor: Oscar * Ejercicio 5 Tema 7 – Herencia
* Clase resta
*/
public class Resta extends Operacion{
	
	//Atributos
	double resta;
	
	//Contructor por defecto
	public Resta() {

	}

	//Contructor con 2 parametros
	public Resta(double n1, double n2) {

		super(n1, n2);
		this.resta = n1 - n2;
		this.setResultado(this.resta);
	}


	public void mostrarResultado(){
		
		System.out.println(this.num1+" - "+this.num2+" = "+this.resultado);
	}
}
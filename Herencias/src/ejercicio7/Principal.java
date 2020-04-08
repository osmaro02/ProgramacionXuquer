package ejercicio7;

/*
* @autor: Oscar * Ejercicio 5 Tema 7 – Herencia
* Clase principal
*/

public class Principal {

	public static void main(String[] args) {
		//Atributos
		double n1 = 10;
		double n2 = 5;

		//suma
		Suma sum = new Suma(n1,n2);
		sum.mostrarResultado();

		//resta
		Resta res = new Resta(n1,n2);
		res.mostrarResultado();

		//multiplicacion
		Multiplicacion mul = new Multiplicacion(n1,n2);
		mul.mostrarResultado();

		//division
		Division div = new Division(n1,n2);
		div.mostrarResultado();
	}
}

package ejercicio6;
/*
* @autor: Oscar * Ejercicio 6 Tema 7 – Herencia
* Clase Principal
*/
public class Principal {
	public static void main(String[] args){


		Comercial c1=new Comercial("Pepe", 29,800, 500);
		Comercial c2=new Comercial("juan", 48,800, 1200);
		Repartidor r1=new Repartidor("pedro",33,1100,1);
		Repartidor r2=new Repartidor("Jose",24,1100,3);
		

		//Comerciales
		c1.Plus();
		System.out.println(c1.toString());

		c2.Plus();
		System.out.println(c2.toString());

		//Espacio en blanco
		System.out.println();

		//Repartidores
		r1.Plus();
		System.out.println(r1.toString());

		r2.Plus();
		System.out.println(r2.toString());
		
		

	}
}

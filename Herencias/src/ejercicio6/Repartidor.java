package ejercicio6;
/*
* @autor: Oscar * Ejercicio 6 Tema 7 – Herencia
* Clase Repartidor
*/
public class Repartidor extends Empleado {

	//Atributos
	private int  zona;


	//Contructor por defecto
	public Repartidor(){
	}

	//Contructor con 2 parametros
	public Repartidor(String nombre ,int edad,double salario, int zona){
		super(nombre,edad,salario);
		this.zona=zona;
	}


	//Métodos
	public double Plus(){
		double SalarioRepartidor=0;
		
		if(super.getEdad()<25 & this.zona==3){
			SalarioRepartidor=(super.getSalario() + getPlus());
			
			super.setSalario(SalarioRepartidor);
			}
		
		return(SalarioRepartidor);   
	}

	public String toString (){

		String mensaje="Repartidor: "+this.Nombre+", edad: "+this.Edad+", salario: "+this.Salario+", zona"+this.zona;
		return mensaje;
	}
}

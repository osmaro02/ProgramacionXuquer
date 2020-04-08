package ejercicio6;
/*
* @autor: Oscar * Ejercicio 6 Tema 7 – Herencia
* Clase Comercial
*/
public class Comercial extends  Empleado {
	
	//Atributos
	private double Comision;

	//Contructor por defecto
	public Comercial(){
	}

	//Contructor con 4 parametros
	public Comercial(String nombre ,int edad,double salario,double comision){
		super(nombre,edad,salario);
		this.Comision=comision;
	}


	//settes y gettes
	public double getComision() {
		return Comision;
	}

	public void setComision(double comision) {
		Comision = comision;
	}

	//Métodos
	public double Plus(){
		double SalarioComercial=0;
		
		if(super.getEdad()>30 & this.Comision>200 ){
			SalarioComercial =(super.getSalario() + getPlus());
			
			super.setSalario(SalarioComercial);
			}
		return SalarioComercial;
		}

	public String toString (){

		String mensaje="Comercial: "+this.Nombre+", edad: "+this.Edad+", salario: "+this.Salario+", comision: "+this.Comision;
		return mensaje;
	}
}

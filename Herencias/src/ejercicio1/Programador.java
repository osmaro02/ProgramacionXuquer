package ejercicio1;

public class Programador extends Empleado {

	int lineasCodigoPorHora;
	String lenguajeDominante; 
	 
	 Programador(){
	 } 
	 
	 Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante){
	  
	  super.nombre = nombre;
	  super.dni = dni;
	  super.edad = edad;
	  super.casado = casado;
	  super.salario = salario;
	  this.lineasCodigoPorHora = lineasDeCodigoPorHora;
	  this.lenguajeDominante = lenguajeDominante;
	 }

	 //------------ getters y setters ------------------
	public int getLineasCodigoPorHora() {
		return lineasCodigoPorHora;
	}

	public void setLineasCodigoPorHora(int lineasCodigoPorHora) {
		this.lineasCodigoPorHora = lineasCodigoPorHora;
	}

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}  
	  
	//------------- nivelProgramacion() ----------------------
	 public void nivelProgramacion(){
		 System.out.println("Programador");
		 
		  if (lineasCodigoPorHora <= 200){
			  System.out.println("Nivel de programación: Level 1"); 
		  }
		  else
		  if ((lineasCodigoPorHora >=200) & (edad <= 500)){
			  System.out.println("Nivel de programación: Level 2"); 
		  }
		  else
		  if (lineasCodigoPorHora > 500){
			  System.out.println("Nivel de programación: Level 3"); 
		  }
		  
		 }
	
}

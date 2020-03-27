package ejercicio1;

public class Empleado  {

	 String nombre;
	 String dni;
	 int edad;
	 boolean casado;
	 double salario;
	  
	 Empleado(){
	 }
	  
	 Empleado(String nombre, String dni, int edad, boolean casado, double salario)  {
	  this.nombre = nombre;
	  this.dni = dni;
	  this.edad = edad;
	  this.casado = casado;
	  this.salario = salario;
	   
	 }
	 
	 //-------------- getters y setters -------------
	 public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	  
	 // ------------- M�todos -----------------
	
	 //--------- clasificacion() ----------------
	 public String Clasificacion(){
	  String c="";
	  if (edad <= 18){
	   c = "Novato";
	  }
	  if ((edad >=19) & (edad <= 25)){
	   c = "Junior";
	  }
	  if (edad > 25){
	   c = "Senior";
	  }
	  return c;
	 }
	 
	  //------------ MostrarDatos() -----------------
	 public void ImprimirEmpleado(){
	  System.out.println(this.nombre);
	  System.out.println(this.dni);
	  System.out.println(this.edad);
	  System.out.println(this.salario);
	  boolean casado = true;
	  if (casado) {
	   System.out.println("Casado");
	  }
	  else
	  {
	   System.out.println("Soltero");
	   }
	  }
	  
	//------------- aumentarSueldo(porcentaje) ----------
	 public void AumentarSueldo(double porcentaje){
	  salario = salario * (1 + porcentaje);
	 }
	  
	

}

package ejercicio5;
/*
* @autor: Oscar * Ejercicio 5 Tema 7 – Herencia
* Clase Producto
*/
public class Producto {
	
	//Atributos
	 protected String Nombre;
	 protected double Precio;
	
	//Contructor por defecto
		 public Producto(){
			 
		 }
	  
 	//Contructor con 2 parametros
	 public Producto(String Nombre,double Precio){
	     this.Nombre=Nombre;
	     this.Precio=Precio;
	 }
	 
	 //settes y gettes
	 
	 public String getNombre(){
	     return this.Nombre;
	 }
	 public void setnombre(String Nombre){
	     this.Nombre=Nombre;
	 }
	 public double getPrecio(){
	     return this.Precio;
	 }
	 public void setPrecio(double Precio){
	    this.Precio=Precio;
	 }
	 
	 
	 //Métodos
	   
	 public double  Calcular(int Cantidad){
	     return(this.Precio*Cantidad);
	 }

	  public String MostrarDatos(){

	      return("NOMBRE: "+this.Nombre+" PRECIO: "+this.Precio);
	  }  
}

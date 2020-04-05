package ejercicio5;
/*
* @autor: Oscar * Ejercicio 5 Tema 7 – Herencia
* Clase NoPercedero
*/
public class NoPerecedero extends Producto{
	
	//Atributos
	 private String tipo;
	 
	//Contructor
	 public NoPerecedero(String Tipo,String Nombre,double Precio){
	     super(Nombre,Precio);
	     this.tipo=Nombre;
	     
	 }
	
	 //settes y gettes
	 public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	    
	    //Métodos
	    @Override
	    
	    public double  Calcular(int Cantidad){
		     return(this.Precio*Cantidad);
		 }
	    
	

	public String MostrarDatos(){
	      return("Nombre: "+this.Nombre+" Precio: "+this.Precio+" Tipo: "+this.tipo);
	  }  

	}

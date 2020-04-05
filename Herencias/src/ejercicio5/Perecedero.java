package ejercicio5;
/*
* @autor: Oscar * Ejercicio 5 Tema 7 – Herencia
* Clase Percedero
*/
public class Perecedero extends Producto{
	
	//Atributos
	 private int diasAcaducar;  
	 
	//Contructor
	 public Perecedero(int DiasCaducar,String Nombre,double Precio){
	     super( Nombre, Precio);
	     this.diasAcaducar=DiasCaducar;
	 }

	 //settes y gettes
	 public int getDiasAcaducar() {
			return diasAcaducar;
		}

		public void setDiasAcaducar(int diasAcaducar) {
			this.diasAcaducar = diasAcaducar;
		}
	    
	    
	    //Métodos
	    
	    @Override
	   public double  Calcular(int Cantidad){
	     double  PrecioTotal=Cantidad*this.Precio;
	     
	     switch(this.diasAcaducar){
	         case 1:
	               PrecioTotal=(PrecioTotal/4);
	             break;
	         case 2:
	             PrecioTotal=(PrecioTotal/3);
	             break;
	         case 3:
	             PrecioTotal=(PrecioTotal/2);
	             break;
	     }  
	       return ( PrecioTotal);
	   }
	     

	public String MostrarDatos(){
	      return("Nombre: "+this.Nombre+" Precio: "+this.Precio+" Dias a caducar: "+this.diasAcaducar);
	  } 

	}
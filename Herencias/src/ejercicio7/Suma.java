package ejercicio7;
  
/*
* @autor: Oscar * Ejercicio 7 Tema 7 – Herencia
* Clase Suma
*/
	public class Suma extends Operacion{
		
		//Atributos
	    double suma;
	    
	  //Contructor por defecto
	    public Suma() {
	    	
	    }
	    
	  //Contructor con 2 parametros
	    public Suma(double n1, double n2) {
	             
	        super(n1, n2);
	        this.suma = n1 + n2;
	        this.setResultado(this.suma);
	

	}   public void mostrarResultado(){
	       
	       System.out.println(this.num1+"+ "+this.num2+" = "+this.resultado);
	       
	   }

}

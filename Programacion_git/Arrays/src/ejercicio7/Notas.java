package ejercicio7;
import java.util.Scanner;
public class Notas {
	/*	- Atributos: un array notas de 5 posiciones. En cada posición se guardará la nota de una asignatura.
		- Constructor por defecto Que inicializará el atributo notas.
		- leer() El método pide al usuario que introduzca 5 notas y las guarda en el array notas.
		- media() El método devuelve la media de todas las notas del array notas.
		- Mostrar() El método imprime por pantalla las notas del array notas.
	 */
	//////////////////////////////////////////////////////////////////////////////////////////  

	// Atributos
	private double notas[] = new double[5];
	private Scanner sc = new Scanner(System.in);
	
	 //----------------------------------------------------------------------------------//

	   //constructor predeterminado
	    public void notas() {
	    	
	    }
	    
	  //----------------------------------------------------------------------------------//
	  		//Constructor settes y gettes	
	    
	    public double[] getNotas() {
			return notas;
		}

		public void setNotas(double[] notas) {
			this.notas = notas;
		}
		
	    
	//----------------------------------------------------------------------------------//
		//Método para leer por teclado las notas 
		
	    public void leer() {
	        
	        System.out.println("");
	        System.out.println("A Continuacion introduce las notas del alumno");
	        System.out.println("");
	        
	        for (int i = 0; i < notas.length; i++) {
	            System.out.print("Introduzca la nota de la asignatura " + (i+1) + ": "); //i+1, para que imprima 1 y no 0.
	            notas[i] = sc.nextDouble();
	            
	            }
	        //return notas;
	    }

	//----------------------------------------------------------------------------------//
		// Metodo que realiza la media de las notas 
	    
	  public double  media() {
		  double mediaNotas=0.0;
	    for (int i=0; i < notas.length; i++) {
	    	 mediaNotas = mediaNotas + notas[i];
	    	}
	    mediaNotas = mediaNotas / notas.length;
	    return mediaNotas;
	    }
	  
	  
	//----------------------------------------------------------------------------------//
		// Metodo que devuelve la media de todas las notas       
	  public String mostrar() {
			 
	      String resultado=""; 
	       for (int i = 0; i < this.notas.length; i++) {
	            resultado = resultado + "La nota asignatura " + (i+1) + ": " + this.notas[i]+"\n";
	          //i+1, para que imprima 1 y no 0. Pero realmente comienza a contar dede 0.
	            
	            }
	       
	       return resultado;
	     
      }
 }

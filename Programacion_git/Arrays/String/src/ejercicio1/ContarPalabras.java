package ejercicio1;

import java.util.Scanner;

public class ContarPalabras {

	public static void main(String[] args) {
		
		/*hacer ejercicio para quitar si hay dos espacios seguidos*/
		Scanner sc=new Scanner(System.in);
				String frase;
				int aux=0;
				
				System.out.println("Introduzca la frase a analizar");
				frase=sc.nextLine();
						
				    int contador = 1; //contador de palabras
				    int posicion; //ultima posicion del caracter de la palabra
				    
				    frase = frase.trim(); //eliminar los posibles espacios en blanco al principio y al final de la frase
				    
				    if (frase.isEmpty()) { //si la cadena está vacía
				       
				    	contador = 0;
				        
				    } else {
				                posicion = frase.indexOf(" "); //se busca el primer espacio en blanco
				                while (posicion != -1) { //mientras que se encuentre un espacio en blanco
				                           //se cuenta una palabra
				                           aux = frase.indexOf(" ", posicion + 1); //se busca el siguiente espacio en blanco a continuación del actual
				                if (aux!=(posicion+1)) {
				                	contador ++;
				                	posicion=aux;
				                }
				                else {
				                	posicion=aux; //cuenta espacios en blanco (posicion + 1)
				                	}
				                }                                               
				            }
				    
				    System.out.println("La frase intruducida, "+ frase + ",  contiene "+ contador +" palabras");		

			sc.close();
	}

}

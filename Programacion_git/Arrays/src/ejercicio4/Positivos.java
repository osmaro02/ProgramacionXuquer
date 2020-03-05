/**
 * Óscar Martínez Romero
 * 1º DAM Programación
 * Centro estudios Xúquer
 * Fecha 02/02/2020
 * Programa 5 array,Positivos, 
 */
package ejercicio4;
import java.util.Scanner;
public class Positivos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int i;
	       
		 int[] numeros = new int[5];
		 System.out.println("Lectura de solo los numeros pares");
	        System.out.println("");
	        
	        for (i = 0; i < numeros.length; i++) {
	            System.out.print("Introduzca numeros enteros positivos y negativos[" + i + "]: ");
	            numeros[i] = sc.nextInt();
	            System.out.println("");	
	            }
	        
	        for (i = 0; i < numeros.length; i++) {
           	 if (numeros[i]>=0) {
          System.out.println("los numeros positivos son: " + numeros[i]);
          }
          
          else {
        	  if (numeros[i]<0) {
                  System.out.println("los numeros negativos son: " + numeros[i]);
                  sc.close();
                  }
        	  }
         }
	}
}

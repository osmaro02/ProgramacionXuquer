/**
 * Óscar Martínez Romero
 * 1º DAM Programación
 * Centro estudios Xúquer
 * Fecha 05/02/2020
 * Programa 3 array,Pares, 
 */
package ejercicio3;
import java.util.Scanner;
public class Pares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int i;
	       
		 double[] pares = new double[5];
		 System.out.println("Lectura de solo los numeros pares");
	        System.out.println("");
	        
	        for (i = 0; i < pares.length; i++) {
	            System.out.print("Introduzca un numero[" + i + "]: ");
	            pares[i] = sc.nextInt();
	            System.out.println("");	
	            }
	        
	        
	            for (i = 0; i < pares.length; i++) {
	            	 if (pares[i]%2==0) {
	           System.out.println("los pares introducidos son: " + pares[i]);
	           sc.close();
	           }
	      }
	}

}

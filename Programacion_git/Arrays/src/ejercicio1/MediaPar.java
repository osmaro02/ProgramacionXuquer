/**
 * Óscar Martínez Romero
 * 1º DAM Programación
 * Centro estudios Xúquer
 * Fecha 02/02/2020
 * Programa 1 array, Par e impar, 
 */

package ejercicio1;
import java.util.Scanner;
public class MediaPar {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			
			 int i;
			 int conPar=0, conImpar=0;//contadores
			 int sumNumPar=0, sumNumImpar=0; 
		       
			 int[] numeros = new int[5];
			
		      //Leemos los valores por teclado y los guardamos en el array
		        System.out.println("Lectura de los elementos del array: ");
		        for (i = 0; i < numeros.length; i++) {
		            System.out.print("numeros[" + i + "]= ");
		            numeros[i] = sc.nextInt();
		        }
		        
		        //se recorre el array para contar pares y su media, 
		        for (i = 0; i < numeros.length; i++) {
		            if (i%2==0) {
		            	
		            	conPar++; // Cuenta los puestos Pares [i]
		            	sumNumPar=sumNumPar+numeros[i]; //suma los numeros introducidos en los puestos Pares.
		            	
		            } else {
		            	conImpar++; // Cuenta los puestos Impares [i]
		            	sumNumImpar=sumNumImpar+numeros[i];//suma los numeros introducidos en los puestos Impares.
		            }
		        }
		        //mostrar resultados
		        sumNumPar=sumNumPar/conPar; 
		        System.out.println("la media de los pares introducidos: " + sumNumPar);
		        
		        sumNumImpar=sumNumImpar/conImpar;
		        System.out.println("la media de los impares introducidos: " + sumNumImpar);
		       sc.close();
		    }
	}


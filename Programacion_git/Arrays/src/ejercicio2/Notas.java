/**
 * Óscar Martínez Romero
 * 1º DAM Programación
 * Centro estudios Xúquer
 * Fecha 04/02/2020
 * Programa 2 array,Notas, 
 */
package ejercicio2;
import java.util.Scanner;
public class Notas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int i;
		 double sum=0;
		 double media=0;
		 //contadores
	       
		 double[] notas = new double[5];
		
	     
	        System.out.println("Lectura de las notas alumnos Xuquer");
	        System.out.println("");
	        for (i = 0; i < notas.length; i++) {
	            System.out.print("Introduzca las notas del alumno[" + i + "]: ");
	            notas[i] = sc.nextInt();
	            System.out.println("");
	        }
	        
	        for(i = 0; i<notas.length;i++){
	    		
	    		sum=sum+notas[i];
	    		}

	      			media = sum/notas.length;
	    			System.out.println("La media de las notas son: "+media);
	    			System.out.println("");
	    			
	    	for(i = 0; i<notas.length;i++){
	    		if(notas[i]>media) {
	    			System.out.println("Las notas superiores a la media son: "+notas[i]);
	    			
	    			sc.close();
	    			}
	    		}
	    	}
	}

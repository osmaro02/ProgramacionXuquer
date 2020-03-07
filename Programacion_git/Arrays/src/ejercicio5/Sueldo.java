/**
 * Óscar Martínez Romero
 * 1º DAM Programación
 * Centro estudios Xúquer
 * Fecha 05/02/2020
 * Programa 5 array,sueldo, 
 */
package ejercicio5;
import java.util.Scanner;
public class Sueldo {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			 int i;
			 double sueldoMayor=0;
			 String nombreMayor="";
		       
			 String[] nombres = new String[5];
			 
			 double[] sueldos = new double[5];
			 
			 System.out.println("A Continuacion introduce los nombres");
		        System.out.println("");
		        
		        for (i = 0; i < nombres.length; i++) {
		            System.out.print("Introduzca un Nombre[" + i + "]: ");
		            nombres[i] = sc.nextLine();
		            }
		        System.out.println("");
		        System.out.println("A Continuacion introduce los sueldos");
		        System.out.println("");
		        
		        
		        for (i = 0; i < sueldos.length; i++) {
		            System.out.print("Introduzca un Sueldo[" + i + "]: ");
		            sueldos[i] = sc.nextDouble();
		            }
		        System.out.println("");
		        
		      
		       
		  
		        for( i=0; i<sueldos.length; i++){
		           
		            if(sueldos[i]>sueldoMayor){ 
		            	sueldoMayor = sueldos[i];
		            	nombreMayor=nombres[i];
		            	
		            }
		        }
		       
		        System.out.print(nombreMayor+" tiene un sueldo de: "+sueldoMayor+"€");
		        sc.close();
		}
	}

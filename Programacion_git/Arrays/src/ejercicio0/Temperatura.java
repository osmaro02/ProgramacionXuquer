/**
 * Óscar Martínez Romero
 * 1º DAM Programación
 * Centro estudios Xúquer
 * Fecha 02/02/2020
 * Programa 0 array, Temperatura 
 */

package ejercicio0;
import java.util.Scanner;
public class Temperatura {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double []temperatura = new double[3];
		
		int i;
		double sum=0;
		
		for(i = 0; i<temperatura.length;i++){
			
			System.out.print("Introduce la temperatura " + i + ": ");
			temperatura[i] = sc.nextDouble();
			temperatura[i]=temperatura[i]+2;
			}
		System.out.println("");
		
		for(i = 0; i<temperatura.length;i++){
		System.out.println("La temperarura +2: "+temperatura[i]);
		
		sum=sum+temperatura[i];
		}
		
			System.out.println("");
			System.out.println("La suma de las temperaruras son: "+sum);
			
			
			if(sum >=0) {
				double media;
			media = sum/temperatura.length;
			System.out.println("La media de las temperaruras positivas son: "+media);
			}
			
			if(sum <0) {
				double media;
			media = sum/temperatura.length;
			System.out.println("La media de las temperaruras negativas son: "+media);
			}
			sc.close();
	}
		
}

/**
 * Óscar Martínez Romero
 * 1º DAM Programación
 * Centro estudios Xúquer
 * Fecha 08/02/2020
 * Programa 6 array,NumerosAleatorios
 */
package ejercicio6;

public class NumerosAleatorios {

	public static void main(String[] args) {
		
		
		double num[] = new double[10];
		int i;
		
		for (i=0;i<num.length;i++) {
			num[i]= (Math.random()*100); //[i] es la posision y random el numero aletorio de 2 cibras(*100), mas decimales (double).
			
			System.out.println("El número aleatorio guardado en la posición v[" + i + "]: = " +num[i]);
		}
	}

}
